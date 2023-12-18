import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int q = scan.nextInt();
		for (int i = 0; i < q ; i++) {

			if(scan.nextInt() == 1) {
				StringBuffer str = new StringBuffer(s);
				s = str.reverse().toString();
			}else {
				if(scan.nextInt() == 1) {
					s =scan.next() + s;
				}else {
					s += scan.next();
				}
			}
		}
		System.out.println(s);

	}

}
