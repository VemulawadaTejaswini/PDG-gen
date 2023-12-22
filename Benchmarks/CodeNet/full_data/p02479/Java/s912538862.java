import java.util.*;
import static java.lang.Math.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		System.out.printf("%.5f %.5f\n", (double)r*r*PI, (double)r*2*PI);
	}
}