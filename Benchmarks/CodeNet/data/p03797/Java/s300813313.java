
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();  //s型
		long M = sc.nextLong();  //c型
		
		if(N >= M / 2) {
			System.out.println(N);
		} else {
			long count = N + (M - N * 2) / 4;
			System.out.println(count);
		}
	}
}


