import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int count = 0;
			Integer []A =new Integer[N];
			for(int i = 0;i<N;i++)A[i]=scan.nextInt();
			
			Arrays.sort(A);
			
			PriorityQueue<Integer>queue = new PriorityQueue<Integer>(new COMP());
			
			for(int i = 0;i<N;i++) {
				queue.add(A[i]);
			}
			
			
			while(count!=M) {
				Integer a = queue.poll();
				a/=2;
				count++;
				queue.add(a);
			}
			
			long goukei = 0;
			
			while(!queue.isEmpty()) {
				goukei+=queue.poll();
			}
	
			System.out.println(goukei);
			
		}
		
		
	}
	
	 static class COMP implements Comparator<Integer>{	
			public int compare(Integer x,Integer y) {
				if(x>y) return -1;
				if(x<y) return 1;
				return 0;
				}
				}
		

}
