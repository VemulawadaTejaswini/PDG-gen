import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		int k = scan.nextInt();
		int last = 0;
		int count =0;
		last = (int)n;

		while(last>0) {

			last = last/k;
			count++;
		}

		System.out.println(count);

		scan.close();
	}
}
