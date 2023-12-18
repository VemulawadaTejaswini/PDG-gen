import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long num = X;
		int ans = 1;
		while(num <= Y) {
			num *= 2;
			ans++;
		}
		ans--;
		System.out.println(ans);
	}
}
