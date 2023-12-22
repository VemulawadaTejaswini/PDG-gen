import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mod = n % 1000;
		int ans = 1000 - mod;
		ans %= 1000;
		System.out.println(ans);
	}
}
