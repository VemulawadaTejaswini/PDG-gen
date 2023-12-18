import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		final String NK = Integer.toString(N, K);
		int ans = NK.length();
		
		System.out.println(ans);
	}
}
