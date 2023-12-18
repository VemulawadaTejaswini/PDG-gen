
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		
		if (S <= 1000000000) {
			System.out.println("0 0 " + S + " 0 0 1");
		}
		else if (S%2 == 0) {
			System.out.println("0 0 " + S/2 + " 0 0 2");
		}
		else {
			for (int i=3; i<100000; i+=2) {
				if (S%i == 0) {
					System.out.println("0 0 " + S/i + " 0 0 " + i);
					break;
				}
			}
		}
	}
}