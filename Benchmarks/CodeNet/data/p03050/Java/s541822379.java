import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long total = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		        long m = n / i - 1;
		        if (m > i) {
		            total += m;
		        }
		    }
		}
		System.out.println(total);
    }
}

