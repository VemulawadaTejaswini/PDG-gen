import java.util.*;
public class Main {
	
	public static class q{
		int a;
		int b;
		int c;
		int d;
	}

	static boolean e(int a) {
		return a % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[M][2];
		int[] num = new int[N+1];
		int[] out = new int[N+1];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			num[a[i][0]]++;
			num[a[i][1]]++;
			if(a[i][1] < a[i][0]) {
				int t = a[i][0];
				a[i][0] = a[i][1];
				a[i][1] = t;
			}
		}
		q[] w = new q[M];
		for(int i = 0; i < M; i++) {
			w[i] = new q();
			w[i].a = i;
			w[i].b = a[i][0];
			w[i].c = a[i][1];
			w[i].d = Math.min(num[a[i][0]], num[a[i][0]]);
		}
		Arrays.sort(w, (x,y) -> x.d-y.d);
		boolean[] aout = new boolean[M];
		for(int i = 0; i < M; i++) {
			if(!e(out[w[i].b]) && e(out[w[i].c]))
				aout[w[i].a] = true;
			else if(e(out[w[i].b]) && !e(out[w[i].c]));
			else {
				if(e(num[w[i].b]) && !e(num[w[i].c]))
					aout[w[i].a] = true;
				else if(!e(num[w[i].b]) && e(num[w[i].c]));
				else if(num[w[i].b] <= num[w[i].c])
					aout[w[i].a] = true;
			}
			num[w[i].b]--;
			num[w[i].c]--;
			if(aout[w[i].a])
				out[w[i].b]++;
			else
				out[w[i].c]++;
		}
		for(int i = 1; i <= N; i++) {
			if(!e(out[i])) {
				System.out.println(-1);
				return;
			}
		}
		for(int i = 0; i < M; i++) {
			if(aout[i])
				System.out.println(a[i][0] + " " + a[i][1]);
			else
				System.out.println(a[i][1] + " " + a[i][0]);
		}

	}

}
