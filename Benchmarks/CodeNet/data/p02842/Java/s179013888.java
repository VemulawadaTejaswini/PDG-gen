public class Main {
	public static void main(String[] args) {

		final int N = new java.util.Scanner(System.in).nextInt();
		double x = N / 1.08;

		int intX = (int) x;

		double d = x - intX;

		if(d == 0) {
			System.out.println(intX);
		}else {
			System.out.println(":(");
		}

	}
}
