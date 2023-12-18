import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long nn = sc.nextLong();
		for (int h = 1; h <= 3500; h++) {
		    for (int n = h; n <= 3500; n++) {
		        if ((4 * h * n - nn * n - nn * h != 0) && ((nn * h * n) % (4 * h * n - nn * n - nn * h)== 0)) {
		            long w = (nn * h * n) / (4 * h * n - nn * n - nn * h);
		            if (w <= 0) {
		                continue;
		            }
	                System.out.println(h + " " + n + " " + w);
	                return;
		        }
		    }
		}
	}
}
	
