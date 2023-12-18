
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
		for(long j = i + 1; j < b + 1; j++) {
			if(j < b - k + 1) {
				j = b - k + 1;
			}
			System.out.println(j);
		}
	}

}
