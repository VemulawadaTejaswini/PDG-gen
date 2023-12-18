import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i=0; i<N; i++)
			H[i] = sc.nextInt();

		int ans = 0;
		int cur = 0;
		for(int i=N-1; i>0; i--) {
			if(H[i-1]>=H[i]) {
				cur++;
				ans = Math.max(ans, cur);
			} else {
				cur = 0;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
