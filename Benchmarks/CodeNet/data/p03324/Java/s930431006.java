import java.util.Scanner;
public class Q2 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int d,n;
			d=scan.nextInt();
			n=scan.nextInt();

			System.out.println(n*Math.pow(10, n));
			scan.close();
		}
}