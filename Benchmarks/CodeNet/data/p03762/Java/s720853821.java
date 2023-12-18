
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static final long DIV = 1000000007;

    public static void main(String[] args) {
	int n = Integer.parseInt(scan.next());
	int m = Integer.parseInt(scan.next());
	long[] x = new long[n];
	long[] y = new long[m];
	
	for (int i = 0; i < n; i++) {
	    x[i] = Long.parseLong(scan.next());
	}
	for (int i = 0; i < m; i++) {
	    y[i] = Long.parseLong(scan.next());
	}

	long sumX = 0;
	for (int i = 1; i <= n; i++) {
	    sumX = sumX + (2*i-1-n)*x[i-1] % DIV;
	}
	long sumY = 0;
	for (int i = 1; i <= m; i++) {
	    sumY = sumY + (2*i-1-m)*y[i-1] % DIV;
	}

	System.out.println((sumX * sumY) % DIV);
	scan.close();
    }
}
