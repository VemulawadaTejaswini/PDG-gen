
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int k=scan.nextInt(), a=scan.nextInt(), b=scan.nextInt();

		int largest = (b / k) * k;


		if(a <= largest) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}



	}
}
