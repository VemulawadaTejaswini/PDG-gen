import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);
		Scanner scan02 = new Scanner(System.in);
		Scanner scan03 = new Scanner(System.in);

		int numbox[] = new int[4];
		numbox[0] = scan01.nextInt();
		numbox[1] = scan02.nextInt();
		numbox[2] = scan03.nextInt();

		numbox[3] = numbox[1];
		numbox[1] = numbox[0];
		numbox[0] = numbox[2];
		numbox[2] = numbox[3];

		System.out.println(numbox[0]);
		System.out.println(numbox[1]);
		System.out.println(numbox[2]);

		scan01.close();
		scan02.close();
		scan03.close();
	}

}