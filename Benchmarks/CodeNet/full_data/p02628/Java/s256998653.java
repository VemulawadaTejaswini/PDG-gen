import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
		
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				int p = sc.nextInt();
				pq.add(p);
			}
			
			int sum = 0;
			for(int i = 0 ; i < k ; i++ ) {
				sum += pq.remove();
			}
			
			System.out.println(sum);
			
		}
	}

}