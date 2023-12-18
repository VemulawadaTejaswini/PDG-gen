import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = a + b;
		double x = Double.parseDouble(c);
		x = Math.pow(x, 0.5);
		if ((x % 1) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}