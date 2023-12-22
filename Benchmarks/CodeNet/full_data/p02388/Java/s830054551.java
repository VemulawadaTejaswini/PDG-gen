import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
		}
		System.out.println(calcCubic(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static int calcCubic(int num) {
		return (int) Math.pow(num, 3);
	}

}