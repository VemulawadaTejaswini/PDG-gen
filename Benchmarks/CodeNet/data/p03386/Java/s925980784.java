
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int k = sc.nextInt();
		long i = 0;
		for(i = a; i < a + k; i++) {
			System.out.println(i);
		}
		for(i = i + 1; i < b; i++) {
			if(i < b - k) {
				i = b - k;
			}
			System.out.println(i);
		}
	}

}
