import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = a * b;
		if(c == 0) {
			System.out.println("Zero");
		}else if(c < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
	}
}