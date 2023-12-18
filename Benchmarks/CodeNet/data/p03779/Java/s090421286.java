import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int i = 0;
		int sum = 0;
		do {
			sum += ++i;
		} while (sum <= X);
		System.out.printf("%d", i);
	}
}
