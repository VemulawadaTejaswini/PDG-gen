
import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int sum = sc.nextInt();

		sum = A + C;
		if ((B + C) < sum) {
			sum = B + C;
		} else if ((B + D) < sum) {
			sum = B + D;
		} else if ((A + D) < sum) {
			sum = A + D;
		}
		System.out.println(sum);
	}

}
