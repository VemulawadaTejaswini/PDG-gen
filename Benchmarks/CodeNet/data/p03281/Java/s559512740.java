import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a >= 195) System.out.println(5);
		else if (a >= 189) System.out.println(4);
		else if (a >= 165) System.out.println(3);
		else if (a >= 135) System.out.println(2);
		else if (a >= 105) System.out.println(1);
		else System.out.println(0);

		sc.close();

	}

}