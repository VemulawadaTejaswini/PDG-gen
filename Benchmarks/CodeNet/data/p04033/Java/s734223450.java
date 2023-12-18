import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		if(a <= 0 && 0 <= b) {
			System.out.println(0);
		}else if(0 < a && 0 < b) {
			System.out.println("Positive");
		}else {
			if((Math.abs(b)-Math.abs(a)+1) % 2 == 0) {
				System.out.println("Positive");
			}else {
				System.out.println("Negative");
			}
		}
	}
}
