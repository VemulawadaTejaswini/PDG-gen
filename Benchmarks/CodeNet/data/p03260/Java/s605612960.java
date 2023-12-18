import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int small;
		int big;
		if (A <= B) {
			small = A;
			big = B;
		} else {
			small = B;
			big = A;
		}
		for (int i = small; i <= big; i++) {
			if (((small * i * big) % 2) != 0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}