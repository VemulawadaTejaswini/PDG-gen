import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int cost = 0;
		if(a <= b) {
			cost = a;
		} else {
			cost = b;
		}
		if(c <= d) {
			cost = cost + c;
		} else {
			cost = cost + d;
		}
		System.out.println(cost);
	}
}