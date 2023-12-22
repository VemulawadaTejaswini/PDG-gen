import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long index[] = new long[100];
		index[0] = 1;
		for (int i = 1; i < 11; i++) {
			index[i] = index[i-1] + (long)Math.pow(26, i);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 10; i >= 0 ; i--) {
			int w = (int)(n/index[i]);
			if (w > 0) {
				long temp = (long)Math.pow(26, i);
				int x = (int)(((n-index[i])/temp));
				sb.append((char)(x + 'a'));
				n= n - (x+1)*temp;
			}
		}
		System.out.println(sb.toString());
	}

}

