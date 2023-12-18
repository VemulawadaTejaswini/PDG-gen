import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;
		for(int k = 1; k < N; k++) {
			int ans = 0;
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					if(Math.min(j - i, Math.abs(j - Y) + Math.abs(i - X) + 1) == k) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
