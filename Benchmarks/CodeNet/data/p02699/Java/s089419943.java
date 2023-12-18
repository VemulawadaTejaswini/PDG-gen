import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int s = stdIn.nextInt();
		int w = stdIn.nextInt();

		if(w >= s) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}

		stdIn.close();
	}
}
