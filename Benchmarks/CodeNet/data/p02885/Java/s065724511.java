import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		if (B * 2 < A) {
			System.out.println(A - B * 2);
			return;
		} else {
			System.out.println("0");
		}
	}
}