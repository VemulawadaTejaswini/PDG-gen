import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double X = scan.nextDouble();
		int B = 0;

		int A = 0;
		while(true) {
			double temp = Math.pow(X - Math.pow(A, 5), 1f / 5f);

			if (Math.floor(temp) == temp) {
				B = (int)temp;
				break;
			}
			A++;
		}

		System.out.println(A + " " + B);
	}
}