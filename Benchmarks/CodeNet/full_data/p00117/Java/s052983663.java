import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\D+");
		
		final int towns = sc.nextInt();
		final int paths = sc.nextInt();
		
		int[][] relates = new int[towns][towns];
		for(int[] tmp:relates){
			for(int i = 0; i < towns; i++){
				tmp[i] = 0;
			}
		}
		
		for(int i = 0; i < paths; i++){
			final int from = sc.nextInt();
			final int to = sc.nextInt();
			final int go = sc.nextInt();
			final int back = sc.nextInt();
			relates[from-1][to-1] = go;
			relates[to-1][from-1] = back;
		}
		
		final int start = sc.nextInt();
		final int end = sc.nextInt();
		final int price = sc.nextInt();
		final int cost = sc.nextInt();
		
		int first_cost = search(start,end,relates,towns);
		int second_cost = search(end,start,relates,towns);
		
		System.out.println(price - cost - first_cost - second_cost);
	}
	
	private static int search(final int start,final int end,int[][] relates,final int towns){
		
		int[] costs = new int[towns];
		for(int i=0; i<towns; i++){
			costs[i] = Integer.MAX_VALUE;
		}
		costs[start-1] = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		
		while(!queue.isEmpty()){
			int cur = queue.poll();
			
			for(int i = 0; i < towns; i++){
				if(relates[cur-1][i] != 0){
					if(costs[i] > (costs[cur-1]+relates[cur-1][i])){
						queue.add(i+1);
						costs[i] = costs[cur-1]+relates[cur-1][i];
					}
				}
			}
		}
		
		return costs[end-1];
	}
	
}