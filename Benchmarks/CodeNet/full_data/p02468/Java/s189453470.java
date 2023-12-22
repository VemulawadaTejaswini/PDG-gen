import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.printf("%d\n", (long)Math.pow(m, n) % 1000000007);
	}

}
