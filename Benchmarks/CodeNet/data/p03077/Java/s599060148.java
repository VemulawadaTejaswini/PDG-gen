import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long[] a = new long[5];
		for (int i = 0; i < 5; i++) a[i] = sc.nextLong();
		Arrays.sort(a);
		System.out.println((long)Math.ceil((double)N/a[0])+4);
	}
}
