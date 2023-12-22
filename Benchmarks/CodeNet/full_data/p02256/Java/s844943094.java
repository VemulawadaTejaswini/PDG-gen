import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a  = number.nextInt();
		int b  = number.nextInt();
		int c;

		if(a < b) {
			c = a;
			a = b;
			b = c;
		}
		do {
			c = b;
			b = a % b;
			a = c;
		}while(a % b != 0);
		System.out.println(b);
	}
}
