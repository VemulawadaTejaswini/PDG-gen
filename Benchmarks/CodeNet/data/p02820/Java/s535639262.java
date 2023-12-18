import java.util.Scanner;
 
public class Main {
 
	static int ans;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int K = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		int r = sc.nextInt();
 
		String T = sc.next();
 
		ans = 0;
 
		boolean[] skipped = new boolean[N + 1];
 
		for (int i = 0; i < N; i++) {
			if (i < K || T.charAt(i - K) != T.charAt(i) || skipped[i - K]) {
				switch (T.charAt(i)) {
					case 'p':
						ans += p;
						break;
					case 'r':
						ans += r;
						break;
					case 's':
						ans += s;
						break;
					default:
				}
			} else if (i >= K) {
				skipped[i] = true;
			}
		}
 
		System.out.println(ans);
	}
}