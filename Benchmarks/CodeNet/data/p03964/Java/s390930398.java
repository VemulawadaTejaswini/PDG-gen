import java.util.*;

public class Main {
    static long total = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long tAll = sc.nextInt();
		long aAll = sc.nextInt();
		for (int i = 1; i < n; i++) {
		    int t = sc.nextInt();
		    int a = sc.nextInt();
		    if (t / (double)a == tAll / (double)aAll) {
		        continue;
		    } else if (t / (double)a > tAll / (double)aAll) {
		        if (aAll % a != 0) {
		            aAll += a - aAll % a;
		        }
		        tAll = aAll / a * t;
		    } else {
		        if (tAll % t != 0) {
		            tAll += t - tAll % t;
		        }
		        aAll = tAll / t * a;
		    }
		}
		System.out.println(tAll + aAll);
	}
}
