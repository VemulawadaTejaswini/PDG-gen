
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int min = Integer.min(a, Integer.min(b, Integer.min(c, Integer.min(d, e))));
		int time;
		if((n % min == 0) || (n < min)) {
			time = n / min + 4;
		} else {
			time = n / min + 5;
		}
		System.out.println(time);
	}

}
