
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static final long MOD = 1000_000_007L;

    public static void main(String[] args) {
	long N = Long.parseLong(scan.next());

	long count = 0;
	for (long u = 0; u <= N; u++) {
	    for (long v = 0; v <= N; v++) {
		for (long a = 0; a <= v; a++) {
		    if((a ^ (v - a)) == u) {
			count = (count + 1) % MOD;
			break;
		    }
		}
	    }
	}
	
	System.out.println(count);
	scan.close();
    }
}
