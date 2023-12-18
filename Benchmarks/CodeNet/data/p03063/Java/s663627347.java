import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[][] rev = new int[2][N+1];
		for(int i=0; i<N; i++)
			rev[0][i+1] = rev[0][i] + (s[i]=='#' ? 1 : 0);
		for(int i=N-1; i>=0; i--)
			rev[1][i] = rev[1][i+1] + (s[i]=='.' ? 1 : 0);
		int ans = N;
		for(int i=0; i<=N; i++)
			ans = Math.min(ans, rev[0][i] + rev[1][i]);
		
		System.out.println(ans);
		sc.close();
	}
}