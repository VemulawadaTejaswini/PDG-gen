import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		for(int i = 0; i < N; i++)
			P[i] = sc.nextInt();
		int ans = 0;
		int min = N, max = 0;
		for(int i = 0; i < N-K; i++) {		
			int lastmin = min, lastmax = max;
			min = N;
			max = 0;
			for(int j = i; j < i+K-1; j++) {
				min = Math.min(min, P[j]);
				max = Math.max(max, P[j]);
			}
			if(lastmin != min || lastmax != max)
				ans++;
		}
		System.out.println(Math.max(ans, 1));

	}

}