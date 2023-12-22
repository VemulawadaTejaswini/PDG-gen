import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long V = sc.nextInt();
		long B = sc.nextInt();
		long W = sc.nextInt();
		long T = sc.nextInt();

		if (V <= W) {
			System.out.println("NO");
		} else {
			long d = Math.abs(A - B);
			if ((V-W)*T>=d) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}