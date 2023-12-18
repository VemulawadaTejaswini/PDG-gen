import java.util.Scanner;

public class Main {
	static int A,P;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		P = sc.nextInt();
		int a = A * 3;
		int b = a + P;
		int ans = b / 2;
		System.out.println(ans);
	}
}