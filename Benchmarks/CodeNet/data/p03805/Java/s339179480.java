import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int M  = sc.nextInt();
		
		boolean[][] path = new boolean[M + 1][M + 1];

		
		for(int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			path[a][b] = true;
			path[b][a] = true;
		}
		
		boolean[] x = new boolean[N + 1];
		x[1] = true;
		
		int sum = root(1, N, x, path);
		System.out.println(sum);
	}
	
	public static int root(int a, int N, boolean[] x, boolean[][] path) {
		boolean y = true;
		for(int i = 1; i <= N; i++) {
			if(x[i] == false) {
				y = false;
				break;
			}
		}
		
		if(y == true) {
			return 1;
		}
		
		int ret = 0;
		
		for(int i = 1; i <= N; i++) {
			if(path[a][i] && !x[i]) {
				x[i] = true;
				ret += root(i, N, x, path);
				x[i] = false;
			}
		}
		return ret;
	}
}
