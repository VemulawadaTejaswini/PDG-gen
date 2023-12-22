import java.util.Scanner;
public class Main {
    static int[] f;
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
	f = new int[45];
	System.out.println(fibonacci(n));
    }
    static int fibonacci (int n) {
	if (n < 0) {
	    return 0;
	}
	if (n == 0 || n == 1) {
	    return f[n] = 1;
	}
	if (f[n] != 0) {
	    return f[n];
	}
	return f[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}