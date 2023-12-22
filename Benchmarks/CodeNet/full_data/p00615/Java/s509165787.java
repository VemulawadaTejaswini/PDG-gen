import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) {
				break;
			}
		
			for(int i = 0; i < n+m; i++) {
				queue.add(stdIn.nextInt());
			}
			int lastTime = 0;;
			int max = 0;
			for(int i = 0; i < n+m; i++) {
				int tmp = queue.poll();
				int s = tmp - lastTime;
				if(max < s) {
					max = s;
				}
				lastTime = tmp;
			}
		
			System.out.println(max);
			queue.clear();
		}
	}
	
}