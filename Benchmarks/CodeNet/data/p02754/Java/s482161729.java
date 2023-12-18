import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		if (A==0) {
			System.out.println("0");
		} else {
			long ans = A*(N/(A+B))+Math.min(A,N%(A+B));
			System.out.println(ans);
		}

	}
}