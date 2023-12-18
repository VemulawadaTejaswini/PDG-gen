import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextInt();
		double r2 = sc.nextInt();
		System.out.println(1.0 / (1.0 / r1 + 1.0 / r2));
	}
}
