import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long[] max = new long[5];
		for (int i=0; i<5; i++) max[i] = scanner.nextLong();

		long neck = max[0];
		for (int i=1; i<5; i++) neck = Math.min(neck, max[i]);
		if (n%neck==0) System.out.println(n/neck+4);
		else System.out.println(n/neck+5);
	}
}