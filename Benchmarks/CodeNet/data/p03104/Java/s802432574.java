
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		long e = B - A;

		if(e % 4 == 0) {
			System.out.println(A);
		}else if(e % 4 == 1) {
			System.out.println(A ^ B);
		}else if(e % 4 == 2) {
			System.out.println(A ^ (B - 1) ^ B);
		}else {
			System.out.println(A ^ (B - 1) ^ (B - 2) ^ B);
		}
	}
}