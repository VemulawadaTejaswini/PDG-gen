import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    long sum = 0;
	    int mod = (int)Math.pow(10, 9) + 7;
	    sc.nextLine();

	    for (int i = 0; i < n; i++) {
	    	a[i] = sc.nextInt() % mod;
	    	if (a[i] == 0) continue;
	    	for (int j = 0; j < i; j++) {
	    		sum = (sum + ((long)a[i] * (long)a[j] % mod)) % mod;
	    	}
	    }
	    System.out.println(sum % mod);
	}
}