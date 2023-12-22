import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextInt();
		double n2 = sc.nextInt();
		double big = Math.max(n1, n2);
		double small = Math.min(n1, n2);
		double ans;
		if (big - small >= 180) {
		    ans = (big - 360 + small) / 2;
		    if (ans < 0) {
		        ans += 360;
		    }
		} else {
		    ans = (big + small) / 2;
		}
		System.out.println(ans);
	}
}

