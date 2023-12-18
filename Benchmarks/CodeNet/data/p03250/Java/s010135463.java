import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws IOException {
	new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();

		Arrays.sort(x);

		System.out.println( x[2] * 10 + x[1]+ x[0]);
	}
}
