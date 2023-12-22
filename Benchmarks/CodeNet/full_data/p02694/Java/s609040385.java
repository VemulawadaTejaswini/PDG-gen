import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong();
		int count = 0;
		int current = 100;

		while(current < X) {
			current = (int)(current  * 1.01);
			count++;
		}
		System.out.println(count);

	}

}
