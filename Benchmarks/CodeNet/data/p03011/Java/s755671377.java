
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int ans = P + Q + R - Math.max(P, Math.max(Q, R));
		System.out.println(ans);
	}

}
