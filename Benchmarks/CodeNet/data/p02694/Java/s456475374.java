import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		int result = 0;
		long x = 100;
		while(x < n){
			result++;
			x = (long) (1.01 * x);
		}
		System.out.println(result);
	}
}
