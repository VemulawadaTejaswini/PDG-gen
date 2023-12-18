
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long N = Long.parseLong(scan.next());

	int min = Integer.MAX_VALUE;
	long A = 1;
	long B = N;
	for (; A <= B; A++) {
	    if(N % A == 0) {
		B = N / A;
		int tmp = F(A, B);
		if(tmp < min) min = tmp;
	    } else {
		B = N / A + 1;
	    }
	}

	System.out.println(min);
	scan.close();
    }

    private static int digits(long x) {
	return (int)Math.log10(x)+1;
    }

    private static int F(long a, long b) {
	int c = digits(a);
	int d = digits(b);

	return (c > d) ? c : d;
    }
}
