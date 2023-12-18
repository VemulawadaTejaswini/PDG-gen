import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long k = sc.nextLong();
		if (Math.abs(a-b) > 1000000000000000000L) {
			System.out.println("Unfair");
		} else {
			System.out.println(a-b);
		}
	}
}