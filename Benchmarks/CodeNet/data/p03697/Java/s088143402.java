import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		if ( a >= -100 && a <= 100 )
			if ( b >= -100 && b <= 100 )
				if ( c >= -100 && c <= 100 )


		if (a <= b) {

			System.out.print("Yes");
			System.out.print(" ");
		} else if (a <= c) {

			System.out.print("Yes");
			System.out.print(" ");

		} else

		{
			System.out.print("No");
			System.out.print(" ");
		}

	}

}