import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			if (T == 1) {
				StringBuffer sb = new StringBuffer(S);
				S = sb.reverse().toString();
			} else {
				int F = sc.nextInt();
				if (F == 1) {
					S = sc.next() + S;
				} else {
					S = S + sc.next();
				}
			}
		}
		sc.close();
		System.out.println(S);
	}
}