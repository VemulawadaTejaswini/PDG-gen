import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int gcd = gcd(a, b);
		System.out.println(a * b / gcd);
	}

	public static int gcd(int n1, int n2) {
    if (n2 == 0)
        return n1;
    return gcd(n2, n1 % n2);
	}
}

