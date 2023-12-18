import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			
			PriorityQueue<Long> queue = new PriorityQueue<>(10, Collections.reverseOrder());
			//List<Long> hList = new ArrayList<Long>();
			for(int i = 0 ; i < n ; i++ )  {
				queue.add(sc.nextLong());
			}
			
//			
			for(int i = 0 ; i < k ; i++ ) {
				queue.poll();
			}
			
			System.out.println(queue.stream().mapToLong(l -> l).sum());
		}
	}
}