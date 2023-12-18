import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Queue<Integer> queue = new PriorityQueue<>();
		for(int i=0;i<N;i++){
			int A = Integer.parseInt(sc.next());
			queue.add(A);
		}
		
		int[][] BC = new int[M][2];
		for(int i=0;i<M;i++){
			BC[i][0] = Integer.parseInt(sc.next());
			BC[i][1] = Integer.parseInt(sc.next());
			
		}
		Arrays.sort(BC,(a,b) -> Integer.compare(b[1], a[1]));
		
		
		
		for(int i=0;i<M;i++){
			int B = BC[i][0];
			int C = BC[i][1];
			//System.out.println(C);
			List<Integer> stock = new ArrayList<>();
			for(int j=0;j<B;j++){
				int p = queue.poll();
				
				if(p>=C){
					stock.add(p);
					continue;
				}else{
					stock.add(C);
				}
				
			}
			
			for(int s : stock){
				queue.add(s);
			}
			
		}
		
		long ans = 0L;
		
		for(int q : queue){
			ans += q;
		}
		
		System.out.println(ans);
			
		
		
		
		
	}
	
	
	
}