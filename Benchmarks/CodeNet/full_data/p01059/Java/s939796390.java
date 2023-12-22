import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
        int prev = 0;		
		for (int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    max = Math.max((x - prev) / 2, max);
		    prev = x;
		    if (i == 0) {
		        max = Math.max(max, x - 1);
		    } 
		    if(i == m - 1) {
		        max = Math.max(max, n - x);
		    }
		}
	    System.out.println(max);
	}
}

