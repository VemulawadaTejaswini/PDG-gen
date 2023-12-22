import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int d = x / y;
		int r = x % y;
		double a = x;
		double b = y;
		double f = a / b;
		System.out.println(d + " " + r + " " + f);
	}
}