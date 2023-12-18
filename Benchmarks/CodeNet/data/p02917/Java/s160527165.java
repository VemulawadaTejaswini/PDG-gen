import java.io.StringReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new StringReader("6\n" + 
				"0 153 10 10 23"));
//		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n - 1;
		int sum = 0;
		int bb = Integer.MAX_VALUE;
		for (int i = 0; i < n1; i++) {
			// iの値を決める
			int b = sc.nextInt();
			if (bb >= b) {
				sum += b;
			} else {
				sum += bb;
			}
			bb = b;
		}
		sum += bb;
		System.out.println(sum);
	}
}
