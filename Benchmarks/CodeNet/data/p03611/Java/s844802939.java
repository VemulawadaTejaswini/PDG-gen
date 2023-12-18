import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int max_cnt = 0;
		
		int cnt_minus = 0;
		int cnt_zero = 0;
		int cnt_plus = 0;
		
		for(int i = 0; i < a[N - 1]; i++) {
			cnt_minus = cnt_zero;
			cnt_zero = cnt_plus;
			cnt_plus = 0;
			
			
			for(int j = 0; j < N; j++) {
				if(i == a[j]) {
					cnt_minus++;
					cnt_zero++;
					cnt_plus++;
				}
			}
			
			max_cnt = Math.max(max_cnt, cnt_minus);
		}
		
		System.out.println(max_cnt);
	}
}
