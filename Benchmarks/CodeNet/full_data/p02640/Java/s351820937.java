import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);

		int X = n.nextInt();
		int Y = n.nextInt();

		if(Y % 2 != 0 || (X*4) < Y || (X*2) > Y) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
