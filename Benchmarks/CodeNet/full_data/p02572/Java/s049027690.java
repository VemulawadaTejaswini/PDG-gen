import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long[] a = new long[n];

	for (int i=0; i<n; i++) a[i] = sc.nextLong();
	long sum = 0;
	long tasu = 0;
	for (int i=0; i<n-1; i++) {
	    tasu = 0;
	    for (int j=i+1; j<n; j++) {
		tasu += a[j];
	    }
	    sum = (sum + a[i] * tasu) % 1000000007;
	}
	System.out.print(sum);
	
    }
}
