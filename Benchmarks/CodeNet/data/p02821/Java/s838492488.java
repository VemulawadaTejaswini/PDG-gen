import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
				int n = sc.nextInt();
				long m = sc.nextLong();
				
				int[] aArray = new int[n];
				
				for(int i = 0 ; i < n ; i++ ) {
					aArray[i] = sc.nextInt();
				}

				PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
				
				for(int i = 0 ; i < n ; i++ ) {
					for(int j = 0 ; j < n ; j++ ) {
						pq.add(aArray[i] + aArray[j]);
					}
				}
				
				long ans = 0;
				while( m > 0) {
					int max = pq.remove();
					ans += max;
					m--;
				}
				
				System.out.println(ans);
		}
	}
}