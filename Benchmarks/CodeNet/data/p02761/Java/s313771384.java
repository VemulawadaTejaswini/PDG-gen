import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] ans = new int[N];
		boolean[] used = new boolean[N];
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(used[s-1] && ans[s-1] != c) {
				System.out.println(-1);
				return;
			}
			ans[s-1] = c;
			used[s-1] = true;
		}
		if(used[0] && ans[0] == 0) {
			if(N == 1)
				System.out.println(0);
			else
				System.out.println(-1);
			return;
		}
		else if(ans[0] == 0)
			ans[0] = 1;
		for(int i = 0; i < N; i++)
			System.out.print(ans[i]);

	}

}