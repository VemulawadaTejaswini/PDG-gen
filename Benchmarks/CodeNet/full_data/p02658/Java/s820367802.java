import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N =scan.nextLong();
		long num = 1;
		for(long i = 0; i < N; i++ ) {
			long A = scan.nextLong();
			num *= A;
			if(1000000000000000000L < num) {
				System.out.println("-1");
				scan.close();
				return;
			}
		}
		System.out.println(num);
		scan.close();
		}

	}
