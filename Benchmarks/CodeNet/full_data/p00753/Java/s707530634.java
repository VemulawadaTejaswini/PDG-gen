import java.io.*;
import java.util.*;

public class icpc2011a {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	while (true) {
	    int n = sc.nextInt();
	    int ans = 0;
	    if (n == 0) {
		break;
	    }
	    
	    ans = solve(n);
	    System.out.println(ans);
	}
    }

    public static int solve(int n) {
	//int max = 123456 * 2;
	//int prime[] = new prime[123456 * 2 + 1];
	boolean is_prime[] = new boolean[123456 * 2 + 1];
	int count = 0;

	//int p = 0;
	for (int i = 0; i <= 2 * n; i++) {
	    is_prime[i] = true;
	}

	is_prime[0] = is_prime[1] = false;
	for (int i = 2; i <= 2 * n; i++) {
	    if (is_prime[i]) {
		// prime[p++] = i;
		for (int j = 2 * i; j <= 2 * n; j += i) {
		    is_prime[j] = false;
		}
	    }
	}
	for (int i = n + 1; i <= 2 * n; i++) {
	    if (is_prime[i]) {
		count++;
	    }
	}
	
	return count;
    }
}