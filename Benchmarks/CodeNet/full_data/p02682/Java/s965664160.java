import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();


		long sum = 0;

		if(K >= A) {
			K -= A;
			sum += A;
		}else {
			sum = K;
			System.out.println(sum);
			return;
		}

		if(K >= B) {
			K -= B;
		}else {
			System.out.println(sum);
			return;
		}

		if(K >= C) {
			K -= C;
			sum -= C;
		}else {
			sum -= K;
			System.out.println(sum);
			return;
		}

		System.out.println(sum);

	}

}
