import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt();
		ArrayDeque<Integer> deque = new ArrayDeque<>(n);
		deque.add(s.nextInt()-1);
		deque.add(s.nextInt()-1);
		for(int i=1; i<n-1; i++){
			int v=s.nextInt()-1;
			if(deque.peekFirst().equals(v)) {
				deque.addFirst(s.nextInt()-1);
			}else if(deque.peekLast().equals(v)) {
				deque.addLast(s.nextInt()-1);
			}else {
				System.out.println("nullpo");
				return;//Judge Reject;
			}
		}
		
		int[] graph = new int[deque.size()];
		for(int i=0;!deque.isEmpty();i++) {
			graph[i]=deque.poll();
		}
		//System.out.println(Arrays.toString(graph));
		
		for(int i=0;i<n;i++) {
			System.out.printf("%.6f\n",graph[0]==i||graph[n-1]==i?n-1.0:(n-1)/2.0);
		}
	}
}
