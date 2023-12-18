
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long ans = Math.abs(753 - S % 1000);
		while(S >= 100) {
			S = S / 10;
			ans = Math.min(ans, Math.abs(753 - S % 1000));
		}
		System.out.println(ans);

	}

}
