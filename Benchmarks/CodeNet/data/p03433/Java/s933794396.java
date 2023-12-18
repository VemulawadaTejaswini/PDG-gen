import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int remaining = N % 500;
		System.out.println(A >= remaining ? "Yes" : "No");
		sc.close();
	}
}