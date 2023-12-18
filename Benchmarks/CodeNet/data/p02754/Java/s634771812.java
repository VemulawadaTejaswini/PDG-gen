import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long a = scan.nextInt();
		long b = scan.nextInt();
		if(a == 0) {
			System.out.println(0);
			return;
		}
		int lineA = 0;
		int lineB = 0;
		while((lineA + lineB) < n) {
			lineA += a;
			lineB += b;
		}

		long s = (lineA + lineB) -n;
		if(s < b) {
			System.out.println(lineA);
		}else {
			System.out.println(lineA - (s - b));
		}

	}

}
