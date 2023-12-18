import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Long N = scan.nextLong();
		Long K = scan.nextLong();

		Long  m = new Long(N % K);
		Long x = new Long(K - m);

		if(m.compareTo(x) == 1) {
			System.out.println(x);
		}else {
			System.out.println(m);
		}


	}
}