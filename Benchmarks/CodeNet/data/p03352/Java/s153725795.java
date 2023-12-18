import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int max = 0;

		Scanner scan = new Scanner(System.in);
		x = Integer.parseInt(scan.next());

		double d = Math.sqrt(x);
		int d1 = (int)d;
		double d2 = Math.pow(d1,2);
		max = (int)d2;

		System.out.println(max);

/*		for(int i = 1 ; i <= x ; i++) {
			double num = Math.sqrt(i);
			int h1 = (int)num;
			double h2 = (double)h1;

			if(num == h2) {
				max = i;
			}
		}
		System.out.println(max);*/

	}
}