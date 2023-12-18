
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = Math.abs(a - b);
		if(k % 2 == 0) {
			k /= 2;
			k += Math.min(a, b);
			System.out.println(k);
		} else {
			System.out.println("IMPOSSIBLE");
		}

	}

}
