import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		if(X==Y) {
			System.out.println(2*X);
		}else {
			if(X>Y) {
				System.out.println(2*X-1);
			}else {
				System.out.println(2*Y-1);
			}
		}
	}
}
