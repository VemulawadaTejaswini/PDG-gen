import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] a_b = str.split(" ", 0);

		int a = Integer.parseInt(a_b[0]);
		int b = Integer.parseInt(a_b[1]);
		double af = a;
		double bf = b;

		int d = a / b;
		int r = a % b;
		double f = af / bf;

		System.out.print(d + " " + r + " ");
		System.out.printf("%.6f", f);
	}
}