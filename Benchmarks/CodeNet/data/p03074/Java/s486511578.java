import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		int ary[] = new int[N + 1];
		int flag[] = new int[N + 1];
		int sum_n = 0;
		int sum[] = new int[N + 1];
		int f = -1;
		
		int cnt = 0;
		Arrays.fill(ary, 0);
		Arrays.fill(flag, -1);
		int cntK = 0;
		for(int i = 0; i < N; i++) {
			if(S.substring(i, i + 1).equals("0")) {
				if(f != 0) {
					f = 0;
					cnt++;
					flag[cnt] = 0;
					cntK++;
				}
				ary[cnt]++;
				sum_n++;
				sum[cnt] = sum_n;
			} else if(S.substring(i, i + 1).equals("1")) {
				if(f != 1) {
					f = 1;
					cnt++;
					flag[cnt] = 1;
				}
				ary[cnt]++;
				sum_n++;
				sum[cnt] = sum_n;
			}
		}
		for(int i = 0; i < N; i++) {
			if(sum[i] == 0) sum[cnt] = sum_n;
		}
		if(cntK <= K) {
			System.out.println(N);
			return;
		}
		int max = 0;
		for(int i = 1; i < N; i++) {
			if(i == 1 && flag[1] == 0) {
				if(i + 2 * K - 1 > N) continue;
				if(max < sum[i + 2 * K - 1]) {
					//System.out.println(i);
					max = sum[i + 2 * K - 1];
				}
			} else {
				if(i + 2 * K > N) continue;
				if(max < sum[i + 2 * K] - sum[i - 1]) {
					//System.out.println(i);
					max = sum[i + 2 * K] - sum[i - 1];
				}
			}
		}
		System.out.println(max);
	}
}
