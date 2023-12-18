import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long N = sc.nextLong();
		int K = sc.nextInt();
		for(int i = 0; i < 40; i++) {
			long pow = (long)Math.pow(K, i);
			if(N < pow) {
				pw.print(i);
				break;
			}
		}
		pw.close();
	}
}