import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int right = 0;
		int left = 0;
		int ans = 2_000_000;
		for (int i=0;i<N;i++) {
			W[i]=sc.nextInt();
			right+=W[i];
		}
		for (int i=0;i<N;i++) {
			ans=Math.min(ans,Math.abs(right-left));
			left+=W[i];
			right-=W[i];
		}
		System.out.println(ans);
	}
}