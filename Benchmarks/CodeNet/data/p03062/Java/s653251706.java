import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();

			long ret = 0;
			boolean plus = true;
			for(int i = 0; i < N - 1; i++) {
				long a = s.nextLong();
				if(a <= 0) {
					plus = !plus;
				}
				ret += Math.abs(a);
			}
			long a = s.nextLong();
			long aa = Math.abs(a);
			if(a < 0 && ret < aa) {
				ret = -ret + aa;
			} else if(plus) {
				ret = ret + a;
			} else {
				ret = ret - a;
			}
			System.out.println(ret);
		}
	}
}
