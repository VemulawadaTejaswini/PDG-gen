import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();
		long b = in.nextLong();
		long k = in.nextLong();

		if (a > k)
			System.out.println((a-k) + " " + b);
		else if (a <= k && k < (a+b))
			System.out.println(0 + " " + (a + b - k));
		else
			System.out.println("0 0");
	}
}

