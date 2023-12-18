import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0; int count = 0; boolean flag = true;
		int[][] state = new int[n][n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < n; j++) {
				state[i][j] = -1;
			}
			for (int j = 0; j < a; j++) {
				state[i][sc.nextInt()-1] = sc.nextInt();
			}
		}
		int[] s = new int[n];

		for (int i = 0; i < (1<<n); i++) {
			flag = true;
			count = 0;
			int I = i;
			for (int j = n-1; j >= 0 ; j--) {
				if((I&1) == 1) {
					s[j] = 1;
					count++;
				}else s[j] = 0;
				I = I>>1;
			}

			for (int j = 0; j < n; j++) {
				if(s[j] == 1) {
					for (int k = 0; k < n; k++) {
						if(state[j][k] == 1) {
							if(s[k] == 0) flag = false;
						}else if(state[j][k] == 0) {
							if(s[k] == 1) flag = false;
						}
					}
				}
			}
			if(flag) max = Math.max(max, count);
		}

		System.out.println(max);
		sc.close();
	}
}