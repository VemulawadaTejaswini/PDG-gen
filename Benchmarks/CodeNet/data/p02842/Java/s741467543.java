public class Main {
	public static void main(String[] args) {

		final int N = new java.util.Scanner(System.in).nextInt();
		double x = N / 1.08;

		int intX = (int) x;

		int initialNum = (int) x;
		int counter = 1;
		double d;

		while(true) {
			d = initialNum + 1.08 * counter;
			if(d < N) {
				counter++;
				continue;
			}
			break;
		}

		int a = (int) d - N;


		if(a == 0) {
			System.out.println(initialNum);
		}else {
			System.out.println(":(");
		}

	}
}
