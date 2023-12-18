
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long A = scan.nextLong();
			long B = scan.nextLong();
			long N = scan.nextLong();

			/*
			for(int x = 0;x<=N;x++) {
				long t = (A*x)/B;
				long s = x/B;

				System.out.println(t-A*s);
			}*/
			long t = (A*(B-1))/B;
			long s = (B-1)/B;


			System.out.println(t-A*s);

		}


	}


}
