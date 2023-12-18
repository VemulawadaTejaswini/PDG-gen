import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Integer temp[] = new Integer[200000];
		int num = 0;
		Arrays.fill(temp, 0);
		for(int i = 0; i < N; i++) {
			if(temp[a[i]] == 0) num++;
			temp[a[i]]++;
		}
		Arrays.sort(temp, Comparator.reverseOrder());
		
		int ans = 0;
		for(int i = 0; i < 200000; i++) {
			if(i + 1 <= K) {
				continue;
			} else if(temp[i] != 0) {
				ans += temp[i];
			}
		}
		System.out.println(ans);
	}
}
