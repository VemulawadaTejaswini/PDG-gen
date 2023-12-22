import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = (long)(in.nextDouble() * 100);
		long c = a * b;
		c -= (c % 100);
		c /= 100;
		System.out.println(c);
	}
}