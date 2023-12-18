import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt(), x = scanner.nextInt(), tmp = 0;
		if(n == x) System.out.println(0);
		tmp += x * 3;
		tmp += (n - x) * 2;
		System.out.println(tmp);
	}
}
