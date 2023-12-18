import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long C = Long.parseLong(sc.next());
		long D = Long.parseLong(sc.next());
		sc.close();

		long formerSquare = A * B;
		long latterSquare = C * D;
		if(formerSquare >= latterSquare) {
			System.out.println(formerSquare);
		}else {
			System.out.println(latterSquare);
		}
	}
}