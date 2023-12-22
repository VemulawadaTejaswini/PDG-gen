import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		long A1 = scanner.nextLong();
		long sum = 0;
		long b = A1;
		//System.out.println("bは" + b);
 		for (long i = 0; i < N-1; i++) {
 			long a = scanner.nextLong();
 			//System.out.println("aは" + a);
 			if (a < b) {
 				sum += b-a;
 				//System.out.println("パターン1");
 			} else {
 				b = a;
 				//System.out.println("パターン2");
 			}
 			//System.out.println(sum);
 		}
 	System.out.println(sum);
	}
}