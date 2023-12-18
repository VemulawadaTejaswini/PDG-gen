package otherContest;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int[] color;
	public static int red, blue;//red:1 blue:2
	public static To[] e;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n-1][2];
		e = new To[n];
		for (int i = 0; i < n; i++) e[i] = new To();
		for (int i = 0; i < n-1; i++) {
			a[i][0] = sc.nextInt()-1;
			a[i][1] = sc.nextInt()-1;
			e[a[i][0]].add(a[i][1]);
			e[a[i][1]].add(a[i][0]);
		}
		color = new int[n];
		red = 1; blue = 0;
		color[0] = 1;
		dfs(0);
		StringBuilder sb = new StringBuilder();
		int a1 = 1, a2 = 2, a3 = 3;
		if(red>n/3&&blue>n/3) {
			for (int i = 0; i < n; i++) {
				if(color[i]==1) {
					if(a1<=n) {
						sb.append(a1);
						a1 += 3;
					}else {
						sb.append(a3);
						a3 += 3;
					}
				}else if(color[i]==2) {
					if(a2<=n) {
						sb.append(a2);
						a2 += 3;
					}else {
						sb.append(a3);
						a3 += 3;
					}
				}
				sb.append(" ");
			}
		}else if(red < blue){
			for (int i = 0; i < n; i++) {
				if(color[i]==1) {
					sb.append(a3);
					a3 += 3;
				}else {
					if(a2<=n) {
						sb.append(a2);
						a2 += 3;
					}else {
						sb.append(a3);
						a3 += 3;
					}
				}
				sb.append(" ");
			}
		}else {
			for (int i = 0; i < n; i++) {
				if(color[i]==2) {
					sb.append(a3);
					a3 += 3;
				}else {
					if(a1<=n) {
						sb.append(a1);
						a1 += 3;
					}else {
						sb.append(a3);
						a3 += 3;
					}
				}
				sb.append(" ");
			}
		}
		System.out.println(new String(sb));
		sc.close();
	}
	public static void dfs(int x) {
		for (int i = 0; i < e[x].size(); i++) {
			if(color[e[x].get(i)]==0) {
				if(color[x]==1) {
					color[e[x].get(i)] = 2;
					blue++;
					dfs(e[x].get(i));
				}else if(color[x]==2) {
					color[e[x].get(i)] = 1;
					red++;
					dfs(e[x].get(i));
				}
			}
		}
		return;
	}
	public static class To{
		ArrayList<Integer> to;
		public To() {
			to = new ArrayList<Integer>();
		}
		public void add(Integer a) {
			to.add(a);
		}
		public int get(int i) {
			return to.get(i);
		}
		public int size() {
			return to.size();
		}
	}
}