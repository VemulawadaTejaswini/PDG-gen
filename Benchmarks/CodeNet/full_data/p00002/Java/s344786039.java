import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner stdin = new Scanner(System.in);

		for(int i = 0; i < 3; i++) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();

		if(a < 0 || b > 1000000) {
				throw new Exception();
			}

			int c = a + b;
			String d = String.valueOf(c);
			System.out.println(d.length());
		}

	}

}