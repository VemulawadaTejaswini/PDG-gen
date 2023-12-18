
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double N = sc.nextInt();

		double X = (double) 100 / 108;

		int result = (int) Math.floor(X * N);

		if (Math.floor(result * 1.08) == N) {
			System.out.println(result);
		} else if (Math.floor((result + 1) * 1.08) == N) {
			System.out.println(result + 1);
		} else {
			System.out.println(":(");

		}

	}
}