import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int scoreh = 0;
		int scorek = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();

		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


		scoreh = h1 * a + h2 * b + (h1 / 10) * c + (h2 / 10) * d;
		scorek = k1 * a + k2 * b + (k1 / 10) * c + (k2 / 10) * d;

		if(scoreh == scorek){
			System.out.println("even");
		} else if(scoreh < scorek){
			System.out.println("kenjiro");
		} else{
			System.out.println("hiroshi");
		}
	}
}