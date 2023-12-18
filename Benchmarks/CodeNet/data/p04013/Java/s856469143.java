import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int x[] = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		
		long ans_cnt = 0;
		for(int i = 0; i < Math.pow(2, N); i++) {
			int num = 0;
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				if((1 & i >> j) == 1) {
					num += x[j];
					cnt++;
				}
			}
			if(cnt != 0 && (double)num / (double)cnt == (double)A) {
				ans_cnt++;
			}
		}
		System.out.println(ans_cnt);
	}
}
