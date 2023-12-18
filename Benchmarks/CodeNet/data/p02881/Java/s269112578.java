import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long min = Long.MAX_VALUE;
	for (long i=1; i<=Math.sqrt(n); i++) {
	    if (n % i == 0) {
		if (n/i + i < min) {
		    min = n/i + i;
		}
	    }
	}
	System.out.print(min-2);
    }
}
