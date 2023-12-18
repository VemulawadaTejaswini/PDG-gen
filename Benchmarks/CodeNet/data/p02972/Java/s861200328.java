import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] org = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
		    org[i] = (sc.nextInt() == 1);
		}
		boolean[] counts = new boolean[n + 1];
		boolean[] ans = new boolean[n + 1];
		for (int i = n; i >= 1; i--) {
		    if (counts[i] != org[i]) {
		        ans[i] = true;
		        counts[1] ^= true;
		        for (int j = 2; j <= Math.sqrt(i); j++) {
		            if (i % j == 0) {
    		            counts[j] ^= true;
    		            if (j * j != i) {
    		                counts[i / j] ^= true;
    		            }
		            }
		        }
		    }
		}
		boolean isFirst = true;
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 1; i <= n; i++) {
		    if (ans[i]) {
		        count++;
		        if (!isFirst) {
		            sb.append(" ");
		        } else {
		            isFirst = false;
		        }
		        sb.append(i);
		    }
		}
		System.out.println(count);
		if (count > 0) {
		    System.out.println(sb);
		}
   }
}
