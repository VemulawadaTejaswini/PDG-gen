import java.util.*;
public class Main {
	static int inf = (int) Math.pow(10, 9);
	static int num, A, B, C;
	static int[] l = new int[1000];
	public static int dfs(int cur, int a, int b, int c) {
		if(cur == num) {
			if(a > 0 && b > 0 && c > 0) {
				return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
			}
			else return inf;
		}
		int ret0 = dfs(cur+1, a, b, c);
		int ret1 = dfs(cur+1, a + l[cur], b, c) + 10;
		int ret2 = dfs(cur+1, a, b + l[cur], c) + 10;
		int ret3 = dfs(cur+1, a, b, c + l[cur]) + 10;
		return Math.min(ret0, Math.min(ret1, Math.min(ret2, ret3)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		for(int i = 0; i < num; i++) l[i] = sc.nextInt();
		System.out.println(dfs(0, 0, 0, 0));
	}

}
