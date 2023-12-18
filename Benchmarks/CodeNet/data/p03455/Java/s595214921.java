import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arg[] =  sc.nextLine().split(" ", 2);


		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);

		if (a * b % 2 == 1) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}


	}

}