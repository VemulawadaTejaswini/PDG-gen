import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = sc.nextInt();
		if (t>N) {
			System.out.println(0);
		} else {
			System.out.println(N-t);
		}

	}
}