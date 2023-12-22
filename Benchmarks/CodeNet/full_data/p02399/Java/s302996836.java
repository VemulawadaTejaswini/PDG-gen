import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextInt();
		long y = scan.nextInt();
		long d = x / y;
		long r = x % y;
		float a = x;
		float b = y;
		float f = a / b;
		System.out.println(d + " " + r + " " + f);
	}
}