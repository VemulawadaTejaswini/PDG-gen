import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int R = scanner.nextInt();
		
		int x = P + Q;
		int y = Q + R;
		int z = R + P;
		
		int min = x;
		
		if (x > y) {
			min = y;
		} else if (x > z) {
			min = z;
		}

		System.out.println(min);
	}
}