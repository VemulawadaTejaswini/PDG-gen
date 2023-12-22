import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			int count = 0;


			if(N%1000!=0)count++;
			count+=N/1000;


			System.out.println(count);

		}


	}


}
