import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		if(R<=1199) {
			System.out.println("ABC");
		} else if (R<=2799) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}
	}
}
