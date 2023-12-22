import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while(sc.hasNext()) {
			int x  = sc.nextInt();
				if (x == 0) {
					break;
				} else {
					System.out.println( length_of_zero( factional(x) ) );
				}

		}

	}

	private static int length_of_zero(long factional) {
		int z = 0;
		char[] chars = Long.toString(factional).toCharArray();

			for (int i = chars.length - 1; i > 0; i--) {
				if (chars[i] == '0') {
					z += 1;
				} else {
					break;
				}
			}

		return z;
	}

	private static long factional(int nextInt) {
		int n = nextInt;
		long ans = (n == 0) ? 1: n * factional(n - 1);
		return ans;
	}

}

