
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for (;;) {

			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int x[] = new int[n];
			int y[] = new int[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			int m = sc.nextInt();

			int dx[] = new int['a'];
			int dy[] = new int['a'];
			dy['N'] = 1;
			dy['S'] = -1;
			dx['E'] = 1;
			dx['W'] = -1;

			int cx = 10;
			int cy = 10;
			
			boolean[] visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				char ch = sc.next().charAt(0);
				int distance = sc.nextInt();

				for (int ii = 0; ii < distance; ii++) {
					cx += dx[ch];
					cy += dy[ch];
					
					for(int j = 0; j < n ; j++){
						if(x[j] == cx && y[j] == cy){
							visited[j] = true;
						}
					}
				}
			}
			
			boolean ans = true;
			for(boolean v: visited){
				ans &= v;
			}
			System.out.println(ans?"Yes":"No");

		}
	}
}

