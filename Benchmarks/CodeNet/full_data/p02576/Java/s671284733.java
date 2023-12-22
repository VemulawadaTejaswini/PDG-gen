import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int X = scan.nextInt();
			int T = scan.nextInt();

			int s = N/X;

			if(N%X!=0)s++;

			System.out.println(T*s);
		}


	}


}
