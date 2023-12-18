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
		
		for(int i = 0; i < a[N - 1]; i++) {
			int cnt = 0;
			for(int j = -1; j <= 1; j++) {
				for(int k = 0; k < N; k++) {
					if(i + j == a[k]) {
						cnt++;
					}
				}
			}
			max_cnt = Math.max(max_cnt, cnt);
		}
		
		System.out.println(max_cnt);
	}
}
