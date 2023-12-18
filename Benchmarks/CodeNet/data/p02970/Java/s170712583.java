import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner		scan	=	new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();



		scan.close();

		if((n /(2d + 1)) % 2 == 0) {
			int k = n / (2 * d + 1) ;
			System.out.println(k);
		} else {
			int k = n / (2 * d + 1) ;
			System.out.println(k + 1);
		}

		scan.close();

	}


}
