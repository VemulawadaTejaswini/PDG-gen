import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();
		long R = sc.nextLong();
		long anser = 0;
		long min = 2 * (long) Math.pow(10, 9);
		for(long i = L ; i<=R;i++) {
			anser = (i*(i+1))%2019;
			min = Math.min(anser, min);
		}
		System.out.println(min);
	}
}