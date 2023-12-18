
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long sunuke = 1;
		for(int i = 1; i < k + 1; i++) {
			System.out.println(sunuke);
			sunuke += Math.pow(10, (long) i / 9);
		}

	}

}
