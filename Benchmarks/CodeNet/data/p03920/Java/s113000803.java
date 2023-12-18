import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 2;
		int ans = 0;
		while(N > cnt) {
			N -= cnt;
			cnt++;
			ans++;
		}
		for(int i = 1; i <= ans; i++) {
			System.out.println(i);
		}
		System.out.println(cnt - 2 + N);
	}
}
