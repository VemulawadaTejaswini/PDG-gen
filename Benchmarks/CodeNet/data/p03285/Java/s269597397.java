import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int a[] = new int[2];
		a[0] = 4;
		a[1] = 7;
		if(dfs(0, N, a)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static boolean dfs(int sum, int N, int a[]) {
		if(sum >= N) return sum == N;
		if(dfs(sum + a[0], N, a)) return true;
		if(dfs(sum + a[1], N, a)) return true;
		return false;
	}
}
