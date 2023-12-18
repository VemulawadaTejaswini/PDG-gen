import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int M  = sc.nextInt();
		
		boolean[][] path = new boolean[8][8];

		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			path[a - 1][b - 1] = true;
			path[b - 1][a - 1] = true;
		}
		
		boolean[] x = new boolean[N];
		x[0] = true;
		
		int sum = root(0, N, x, path);
		System.out.println(sum);
	}
	
	public static int root(int a, int N, boolean[] x, boolean[][] path) {
		boolean y = true;
		for(int i = 0; i < N; i++) {
			if(!x[i]) {
				y = false;
			}
		}
		
		if(y) {
			return 1;
		}
		
		int ret = 0;
		
		for(int i = 0; i < N; i++) {
			if(path[a][i] && !x[i]) {
				x[i] = true;
				ret += root(i, N, x, path);
				x[i] = false;
			}
		}
		return ret;
	}
}
