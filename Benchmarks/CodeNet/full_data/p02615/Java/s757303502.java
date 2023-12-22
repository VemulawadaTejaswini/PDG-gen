import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int[] aArray = new int[n];
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(n, Collections.reverseOrder());
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				pq.add(aArray[i]);
			}
			
			//
			PriorityQueue<Integer> pq2 = new PriorityQueue<>(n*2, Collections.reverseOrder());
			
			int max = pq.remove(); //first person
			pq2.add(max);
						
			int ans = 0;
			for(int i = 1 ; i < n ; i++ ) {
				
				int el = pq.remove();
				int score = pq2.remove();
				
				pq2.add(el);
				pq2.add(el);
				
				ans += score;
			
			}
			
			System.out.println(ans);
		}
	}

}