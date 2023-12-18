import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		if(x % 11 < 7) {
			System.out.println(2 * (x / 11) + 1);
		} else {
			System.out.println(2 * (x / 11) + 2);
		}
	}
}