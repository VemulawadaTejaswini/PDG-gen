import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while(true) {
			int M = sc.nextInt();
			int T = sc.nextInt();
			int P = sc.nextInt();
			int R = sc.nextInt();
			if(M == 0 && T == 0 && P == 0 && R == 0) {
				sc.close();
				break;
			}
			int[] m = new int[R];
			int[] t = new int[R];
			int[] p = new int[R];
			int[] j = new int[R];
			for(int i = 0; i < R; i++) {
				m[i] = sc.nextInt();
				t[i] = sc.nextInt();
				p[i] = sc.nextInt();
				j[i] = sc.nextInt();
			}
			sb.append(solve(T, P, R, m, t, p, j));
			sb.append("\n");
		}
		System.out.print(sb.toString());
		//System.out.print(debug.toString());
	}
	static StringBuilder debug = new StringBuilder();
	static String solve(int T, int P, int R, int[] m, int[] t, int[] p, int[] j) {
		StringBuilder sb = new StringBuilder();
		Data[] d = new Data[T];
		for(int i = 0; i < T; i++) {
			d[i] = new Data(i + 1, 0, 0);
			d[i].setP(P);
		}
		for(int i = 0; i < R; i++) {
			if(j[i] == 0) {
				d[t[i] - 1].n += 1;
				d[t[i] - 1].time += m[i] + 20 * d[t[i] - 1].cnt[p[i] - 1];
			}else {
				d[t[i] - 1].cnt[p[i] - 1] += 1;
			}
		}
		Arrays.sort(d, new MyComparator());
		for(int i = 0; i < T; i++) {
			debug.append(d[i].id).append(" ");
		}
		debug.append("\n");
		int[] rank = new int[T];
		for(int i = 1; i < T; i++) {
			if(d[i - 1].n > d[i].n) {
				rank[i] = rank[i - 1] + 1;
			}else {
				if(d[i - 1].time == d[i].time) {
					rank[i] = rank[i - 1];
				}else {
					rank[i] = rank[i - 1] + 1;
				}
			}
		}
		int[] g = new int[rank[T - 1] + 1];
		if(g.length == 1) {
			String temp = "";
			for(int i = T; i >= 1; i--) {
				if(i == T) {
					temp += Integer.toString(i);
				}else {
					temp += "=" + Integer.toString(i);
				}
			}
			return temp;
		}
		for(int i = 0; i < T; i++) {
			g[rank[i]]++;
		}
		String[] s = new String[g.length];
		int idx = 0;
		for(int i = 0; i < g.length; i++) {
			if(g[i] == 1) {
				s[i] = Integer.toString(d[idx].id);
				idx++;
			}else {
				String temp = "";
				for(int l = 0; l < g[i]; l++) {
					if(l == 0) {
						temp += Integer.toString(d[idx].id);
					}else {
						temp += "=" + Integer.toString(d[idx].id);
					}
					idx++;
				}
				s[i] = temp;
			}
		}
		for(int i = 0; i < g.length; i++) {
			if(i == 0) {
				sb.append(s[i]);
			}else {
				sb.append(",").append(s[i]);
			}
		}
		return sb.toString();
	}
	static class Data{
		int id, n, time, P;
		int []cnt;
		public Data(int id, int n, int time) {
			this.id = id;
			this.n = n;
			this.time = time;
		}
		public void setP(int P) {
			cnt = new int[P];
		}
	}
	static class MyComparator implements Comparator<Data>{
		@Override
		public int compare(Data d2, Data d1) {
			if(d1.n > d2.n) {
				return 1;
			}else if(d1.n < d2.n){
				return -1;
			}else {
				if(d1.time > d2.time) {
					return -1;
				}else if(d1.time == d2.time) {
					if(d1.id > d2.id) {
						return 1;
					}else {
						return -1;
					}
				}else {
					return 1;
				}
			}
		}
	}
}
