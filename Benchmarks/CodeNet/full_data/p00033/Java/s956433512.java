import java.util.Scanner;

public class Main{
	static boolean flag = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j = 0; j < n; j++) {
			int[] b = new int[10];
			flag = false;
			for(int i = 0; i < 10; i++) {
				b[i] = sc.nextInt();
			}
			dfs(0, 0, 0, b);
			if(flag) {
				//System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	static void dfs(int n, int l, int r, int[] b) {
		if(n == 10) {
			flag = true;
			System.out.println("YES");
			return;
		}
		if(l < b[n] && !flag) {
			dfs(n + 1, b[n], r, b);
		}
		if(r < b[n] && !flag) {
			dfs(n + 1, l, b[n], b);
		}
		return;
	}
}
