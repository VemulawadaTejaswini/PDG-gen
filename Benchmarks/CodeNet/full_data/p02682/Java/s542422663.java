import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int plus = D - A;
		int zero = plus - B;

		int sum = 0;

		if (plus > 0) {
			sum += A;
			if (zero > 0) {
				sum -= C;
				System.out.print(sum);
			} else {
				System.out.print(sum);
			}
		} else {
			sum += D;
			System.out.print(sum);
		}

		return;

	}
}
