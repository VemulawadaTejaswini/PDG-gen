import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n ; i++) {
			int j = i;
			int t = 0;
			while (j != n) {
				if (s[j - 1] <= t && t % f[j - 1] == 0) {
					t += c[j - 1];
					j++;
				} else {
					t++;
				}
			}
			System.out.println(t);
		}
	}
}