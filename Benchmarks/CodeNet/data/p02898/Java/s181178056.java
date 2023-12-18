import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i=0;i<N;i++) {
			int h = Integer.parseInt(sc.next());
			if (h>=K) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}