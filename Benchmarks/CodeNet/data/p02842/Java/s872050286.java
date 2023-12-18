import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double tax = 1.08;
		int candidateAmount = (int) Math.ceil(N / tax);
		if ((int) Math.floor(candidateAmount * tax) == N) {
			System.out.print(candidateAmount);
		} else {
			System.out.print(":(");
		}
	}
}
