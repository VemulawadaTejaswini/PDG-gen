
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long sum=0;

		for (int i = 0; i < 4; i++) {
			int let =sc.nextInt() ;
			if (let % 10 !=0) {
				let =(let/10 + 1)*10;
			}
			sum+=let;
		}

		System.out.println(sum+sc.nextInt());

	}
}


