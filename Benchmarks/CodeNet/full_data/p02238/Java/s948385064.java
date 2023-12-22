import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int[][] map = new int[n][n];
			int[] state = new int[n];
			int[] discovery = new int[n];
			int[] finish = new int[n];
			for(int i=0; i<n; i++) {
				int from = scan.nextInt()-1;
				int m = scan.nextInt();
				for(int j=0; j<m; j++) {
					int to = scan.nextInt()-1;
					map[from][to] = 1;
				}
			}
			Stack<Integer> stack = new Stack<>();
			stack.push(0);
			state[0] = 1;
			int time = 1;
			discovery[0] = time;
			while(!stack.isEmpty()) {
				int now = stack.peek();
				time++;
				boolean findConnect = false;
				for(int i=0; i<n; i++) {
					if(now == i) continue;
					if(map[now][i] == 1 && state[i] == 0) {
						stack.push(i);
						state[i] = 1;
						discovery[i] = time;
						findConnect = true;
						break;
					}
				}
				if(!findConnect) {
					stack.pop();
					state[now] = 2;
					finish[now] = time;
				}
			}
			for(int i=0; i<n; i++) {
				System.out.println((i+1) + " " + discovery[i] + " " + finish[i]);
			}
		}
	}
}

