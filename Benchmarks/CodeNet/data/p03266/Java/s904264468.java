import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0;
		boolean isEv = (k % 2 == 0);
		for (int i = 0; i * k <= n; i++) {
		    for (int j = i; j * k <= n; j++) {
		        for (int l = j; l * k <= n; l++) {
		            if (isEv && l * k + k / 2 <= n) {
		                if (i == j && j == l) {
		                    count++;
		                } else if (i == j || j == l) {
		                    count += 3;
		                } else {
		                    count += 6;
		                }
		            }
		            if (i != 0) {
		                if (i == j && j == l) {
		                    count++;
		                } else if (i == j || j == l) {
		                    count += 3;
		                } else {
		                    count += 6;
		                }
		            }
		        }
		    }
		}
       System.out.println(count);
	}
}
