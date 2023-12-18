import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] result = new int[m];
		int l, r;
		for(int i = 1; i <= n; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			for(int j = 1; j <= m; j++) {
				for(int stop = 0; stop <= m; stop += j) {
					if(stop >= l && stop <= r) {
						result[j - 1]++;
						stop = m + 1;
					}
				}
			}
		}
		for(int i = 0; i < m; i++)
			System.out.println(String.valueOf(result[i]));
	}
}