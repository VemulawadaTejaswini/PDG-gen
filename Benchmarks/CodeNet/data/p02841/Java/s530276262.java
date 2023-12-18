import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();
		int M2 = sc.nextInt();
		int D2 = sc.nextInt();
		if (M1 == M2) {
			System.out.print(0);
		} else {
			System.out.print(1);
		}
	}
}
