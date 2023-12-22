import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		System.out.println(toAlphabet(N));
	}

	public static String toAlphabet(long num){
		if (num <= 0) return "";
		long n = num % 26;
		n = (n == 0) ? 26 : n;
		char alphabet = 'a' - 1;
		for (long i = 0; i < n; i++) {
			alphabet++;
		}
		String s = String.valueOf(alphabet);
		if (num == n) return s;
		return toAlphabet((num - n) / 26) + s;
	}

}
