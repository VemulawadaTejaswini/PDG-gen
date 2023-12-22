
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (B - A + 1 >= K) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}