import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	long mod = 1000000007;
	long wa = 0;
	for (int i=0; i<n; i++) {
	    a[i] = sc.nextInt();
	    wa += a[i];
	    wa %= mod;
	}
	long sum = 0;
	for (int i=0; i<n; i++) {
	    wa -= a[i];
	    if (wa < 0) sum += mod;
	    sum += a[i] * wa;
	    sum %= mod;
	}
	System.out.print(sum);
	
    }
}
