import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int cost = 0;

		if (A >= 13) {
			cost = B ;
		} else if ( 6 <=A && A<= 12) {
			cost = B/2;
		} else {
			cost = 0;
		}
		System.out.println(cost);
	}
}