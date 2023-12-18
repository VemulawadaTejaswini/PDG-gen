
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[][] order = new int[n + 1][n + 1];
		int[] num = new int[n + 1];
		boolean[] change = new boolean[n + 1];
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n; j++) {
				order[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i < n + 1; i++) {
			num[i] = 1;
			order[i][0] = 0;
			order[i][n] = 0;
		}
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 1; i < n + 1; i++) {
				change[i] = false;
			}
			for(int i = 1; i < n; i++) {
				int enemy = order[i][num[i]];
				if(!change[i] && !change[enemy] && i == order[enemy][num[enemy]]) {
					num[i]++;
					num[enemy]++;
					change[i] = true;
					change[enemy] = true;
				}
			}
			for(int i = 1; i < n + 1; i++) {
				if(change[i])
					flag = true;
			}
			ans++;
		}
		ans--;
		flag = true;
		for(int i = 1; i < n + 1; i++) {
			if(num[i] != n)
				flag = false;
		}
		if(flag) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}

}
