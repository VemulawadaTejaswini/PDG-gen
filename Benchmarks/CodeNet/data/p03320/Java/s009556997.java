
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k = sc.nextInt();

		for (long i=1;i<=k;i++) {
			System.out.println(i<=9? i : (i-9+""+9));
		}
	}




}

