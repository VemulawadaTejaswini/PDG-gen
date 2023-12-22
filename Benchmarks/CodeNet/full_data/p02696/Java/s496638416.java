import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		long a = Long.parseLong(tmp[0]);
		long b = Long.parseLong(tmp[1]);
		long n = Long.parseLong(tmp[2]);


		long minmax = Math.min(n, b - 1);
		if(minmax < b) {

		long zero = (long)(Math.floor((a * minmax) / b) + a * Math.floor(minmax / b));

		long max  = (long)(Math.floor((a * n) / b) + a * Math.floor(n/ b));

		System.out.println(Math.max(max, zero));
		return;
		}

		long max  = (long)(Math.floor((a * n) / b) + a * Math.floor(n/ b));

		System.out.println(max);




	}

}
