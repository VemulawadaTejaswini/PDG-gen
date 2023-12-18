import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] l = new int[N][N];
		int[] d = new int[N];
		Arrays.fill(d, -1);
		for(int i = 0; i < N-1; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt() % 2;
			l[u][v] = l[v][u] = w;
		}
		for(int i = 0; i < N; i++) {
			if(d[i] % 2 == 0)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}
