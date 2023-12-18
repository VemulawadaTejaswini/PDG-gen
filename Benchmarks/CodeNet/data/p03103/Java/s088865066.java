import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] cell = new long[n][2];
		for(int i = 0; i < n; i++) {
			cell[i][0] = sc.nextInt();
			cell[i][1] = sc.nextInt();
		}
		Arrays.sort(cell, (a, b) -> Long.compare(a[0], b[0]));
		long ans = 0;
		long cnt  = m;
		for(int i = 0; i < n; i++) {
			if(cnt >= cell[i][1]) {
				ans += cell[i][0] * cell[i][1];
				cnt -= cell[i][1];
			}else {
				ans += cell[i][0] * cnt;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}

