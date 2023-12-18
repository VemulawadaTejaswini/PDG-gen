import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();


			long A = (c-a-b)*(c-a-b);
			long B = 4*a*b;
			long C =(a+b)*(a+b);

			if(C<B&&B<A) System.out.println("Yes");
			else System.out.println("No");


		}


	}


}
