import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int []A = new int[N];
			int []B = new int[N];
			long nowtime = 0;
			
			Map<Integer,PriorityQueue<Integer>>map = new TreeMap<Integer,PriorityQueue<Integer>>();
			
			
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = scan.nextInt();
				
				if(!map.containsKey(B[i])) {
					map.put(B[i], new PriorityQueue<Integer>());
					map.get(B[i]).add(A[i]);
				}else {
					map.get(B[i]).add(A[i]);
				}
			}
			
			for(Integer key:map.keySet()) {
				//Collections.sort(map.get(key));
				for(int i = 0;i<map.get(key).size();i++) {
					nowtime+=map.get(key).poll();
					//System.out.print(nowtime);
					//System.out.print(" ");
					//System.out.println(key);
					if(nowtime>key) {
						System.out.println("No");
						System.exit(0);
					}
					//System.out.print(map.get(key).get(i));
					//System.out.print(" ");
				}
				//System.out.println();
			}
			
			
			
			System.out.println("Yes");
			
			
			
			
			
			
			
			
			
		}
	}
	
	 
	
}
