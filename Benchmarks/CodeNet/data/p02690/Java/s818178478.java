import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();
		long a = (long)(calc((double)X, 5.0) + 0.5);
		long bb = X - (long)Math.pow(a, 5.0);
		long b = (long)(calc((double)Math.abs(bb), 5.0) + 0.5);
		// System.out.println(a + " " + bb + " " + b);
		System.out.println(a + " " + b);
	}

	static private Double calc(Double base, Double n) {
        return Math.pow(Math.E, Math.log(base)/n);
    }
}
