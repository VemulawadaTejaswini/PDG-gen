import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		StringBuffer sb = new StringBuffer();

		do {
			int result = (int)n % 26;
			sb.insert(0, c[result-1]);
			n = n / 26;
		} while (n > 0);

		System.out.println(sb.toString());
	}

}