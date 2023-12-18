import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int initiala = a;
		int result = 0;
		for (;a <= b; a++) {
			if (a == initiala) {
				result = a * (a + 1);
			} else {
				result = result * (a + 1);
			}
			if (result == 0) {
				break;
			}
		}
		if(result > 0){
			System.out.println("Positive");
		} else if(result < 0){
			System.out.println("Negative");
		} else if (result == 0) {
			System.out.println("Zero");
		}
	}
}
