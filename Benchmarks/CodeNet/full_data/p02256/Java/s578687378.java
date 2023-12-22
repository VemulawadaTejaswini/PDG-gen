import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x;
		int y;
		if(a >= b) {
			x = a;
			y = b;
		}else {
			x = b;
			y = a;
		}
		int gcd;
		while ((gcd = x % y) != 0) {
			x = y;
			y = gcd;
		}
		System.out.println(y);
	}

}
