import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int aPos = ('a');
		StringBuilder res = new StringBuilder();
		while (N != 0) {
			if (N % 26 == 0) {
				res.insert(0, 'z');
				N--;
			} else {
				res.insert(0, (char) (aPos + (N % 26) - 1));
			}
			N /= 26;
		}
		System.out.println(res);
	}
}