import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	int count = 1;
	int ans = 0;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] flag = new boolean[51];
		int[] a = new int[51];
		int[] b = new int[51];
		int[][] V = new int[51][51];
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			V[a[i]][b[i]] = V[b[i]][a[i]] = 1;
		}
		Deque<Integer> q = new ArrayDeque<>();
		for(int i = 0; i < m; i++) {
			V[a[i]][b[i]] = V[b[i]][a[i]] = 0;
			q.push(1);
			flag[a[0]] = true;
			while(!q.isEmpty()) {
				int tmp = q.pop();
				for(int j = 1; j <= n; j++) {
					if(V[tmp][j] == 1 && !flag[j]) {
						q.push(j);
						flag[j] = true;
						count++;
					}
				}
			}
			if(count != n) {
				ans++;
			}
			count = 1;
			V[a[i]][b[i]] = V[b[i]][a[i]] = 1;
			Arrays.fill(flag, false);;
		}
		System.out.println(ans);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}