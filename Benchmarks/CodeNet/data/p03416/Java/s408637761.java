import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int result = 0;
		for (; A <= B; A++) {
			int digit1 = A / 10000;
			int digit2 = A / 1000 % 10;
			int digit4 = A / 10 % 10;
			int digit5 = A % 10;
			if (digit1 == digit5 && digit2 == digit4) {
				result++;
			}
		}
		System.out.println(result);
	}
}
