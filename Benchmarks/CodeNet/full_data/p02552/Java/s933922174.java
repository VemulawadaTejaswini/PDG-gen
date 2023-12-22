import java.util.Scanner;

public class Do2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long[] num = { a*b, a*c, a*d, b*c, c*d };
      max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = (int) num[i];
			}
		}
		System.out.println(max);
      sc.close();
	}
}