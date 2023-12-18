import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		long B = scan.nextLong();
		long K = scan.nextLong();

		if(K <= A) {
			System.out.println(A -K  + " "+ B);
		}else if(K <= A + B) {
			System.out.println(0 + " "+( B-(K - A)));
		}else {
			System.out.println(0 + " " +0);
		}
	
	}
}