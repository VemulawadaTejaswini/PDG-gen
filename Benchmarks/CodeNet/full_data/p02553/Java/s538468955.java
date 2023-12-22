import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();

		int max1 =a*c;
		int max2 =a*d;

		int max3 =b*c;
		int max4 =b*d;

		int max = Math.max(Math.max(max1,max2),Math.max(max3, max4));

		System.out.println(max);
	}
}