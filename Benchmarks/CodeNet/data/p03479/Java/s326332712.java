import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	public static void C(Scanner sc) {
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		long k = (long) ((Math.log(y)-Math.log(x))/Math.log(2));
		out.print(k+1);
	}
}
