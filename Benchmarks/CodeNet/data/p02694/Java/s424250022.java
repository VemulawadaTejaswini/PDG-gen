import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = Long.parseLong(scanner.nextLine());
		long a = 100;
		long x = 0;
		while(a < n) {

			a += a / 100;
			x++;
		}
		System.out.println(x);



	}

}
