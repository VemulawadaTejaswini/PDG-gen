import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long a = 10;
		long b = 9;
		long c = 8;
		long p = 1000000007;

		for(int i=0;i<N-1;i++) {
			a = (a*10) % p;
		}
		for(int i=0;i<N-1;i++) {
			b = (b*9) % p;
		}
		for(int i=0;i<N-1;i++) {
			c = (c*8) % p;
		}
		long ans = (a+c-b-b)%p;

		System.out.println(ans);

	}
}
