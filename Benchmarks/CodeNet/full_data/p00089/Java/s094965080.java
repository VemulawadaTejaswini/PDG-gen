import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0089
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ans = 0, before = 0;
		int[][] sum = new int[102][102];
		for (int i = 0; i <= 101; i++) fill(sum[i], 0);
		for (int i = 1; sc.hasNext(); i++) {
			String[] ss = sc.next().split(",");
			for (int j = 1; j <= ss.length; j++) {
				if (before < ss.length) {
					sum[i][j] = max(sum[i - 1][j - 1], sum[i - 1][j]) + new Integer(ss[j - 1]);					
				} else {
					sum[i][j] = max(sum[i - 1][j], sum[i - 1][j + 1]) + new Integer(ss[j - 1]);
				}

				ans = max(ans, sum[i][j]);
			}
			
			before = ss.length;
		}
		
		System.out.println(ans);		
	}
}