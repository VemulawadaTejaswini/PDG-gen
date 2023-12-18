import java.util.Scanner;

public class Main {
	static int[] g;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		g = new int[N];
		while(true) {
			int m = 1;
			int l = 0;
			int r = 0;
			int c = 0;
			int flag = 0;
			for(int i = 0; i < N; i++) {
				if(h[i] == g[i]) {
					flag++;
					if(flag == N) {
						System.out.println(cnt);
						System.exit(0);
					}
				}
				if(h[i] - g[i] > 0) {
					c++;
					if(c == 1) {
						m = h[i] - g[i];
					}else {
						m = Math.min(m, h[i] - g[i]);
					}
					if(i == N - 1) {
						m = Math.min(m, h[i] - g[i]);
						//System.out.println(i +" " + c);
						add(i - c + 1, i, m);
						//disp(g);
						c = 0;
						cnt += m;
					}
				}else {
					if(c == 0) {
						continue;
					}else {
						add(i - c, i - 1, m);
						//disp(g);
						c = 0;
						cnt += m;
					}
				}
			}
		}
	}

	static void disp(int[] a) {
		for(int i : a) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	static void add(int l, int r, int m) {
		for(int i = l; i <= r; i++) {
			g[i] += m;
		}
	}
}