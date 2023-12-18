import java.util.Scanner;

//AtCoder Beginner Contest 153
//D - Caracal vs Monster
public class Main {

	public static long attack(long H) {
		if (H <= 1) return 1;
		else {
			long ans = 1;
			if (H % 2 == 0) {
				ans += attack(H / 2) * 2;
			} else {
				ans += attack((H - 1) / 2) * 2;
			}
			return ans;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = Long.parseLong(sc.next());
		sc.close();

		long ans = attack(H);
 		System.out.println(ans);
	}
}
