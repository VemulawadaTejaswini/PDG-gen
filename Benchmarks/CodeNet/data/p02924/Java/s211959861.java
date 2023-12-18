import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		double n = (double)sc.nextInt();
		
		double ans = 0;
	  for (int i = 1; i < n; i++) {
			ans += (double)i;
		}
		System.out.println((int)ans);
	}
}