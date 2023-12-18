import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long h = Long.parseLong(scanner.nextLine());
		long ans = bin(h);
		System.out.println(ans);

	}


	public static long bin(long x) {

		long count = 0;

		if(x <= 1) {

			count = 1;

			return count;

		}



		while(x > 1) {

			if(x % 2 != 0) {

				x = x - 1;

			}

			x /= 2;
			count++;

		}

		return (long) ((Math.pow(2,count + 1)) - 1);

	}

}