import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] ar = new double[10];
		
		while (sc.hasNext()) {
			ar[0] = sc.nextDouble();
			double total = ar[0];
			for (int i=1; i<=9; i++) {
				if (i%2==1) {
					ar[i] = ar[i-1]*2;
				}
				else {
					ar[i] = ar[i-1]/3;
				}
				total += ar[i];
			}
			out.println(total);
		}
	}
}
