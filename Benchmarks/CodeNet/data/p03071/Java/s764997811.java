import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int X = 0;
		int Y = 0;

		for (int i = 0; i < 2; i++) {
			if (A >= B) {
				X = A;
				if (A-1 >= B) {
					Y = A;
				}else {
					Y = B;
				}
			} else if (A < B) {
				X = B;
				if (B-1 >= A) {
					Y = B;
				}else {
					Y = A;
				}
			}
		}
		System.out.println(X+Y);
	}
}