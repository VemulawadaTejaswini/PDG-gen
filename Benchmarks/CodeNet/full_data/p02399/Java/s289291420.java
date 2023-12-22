import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int a,b;
		int d,r;
		double f;

		Scanner stdIn = new Scanner(System.in);

		a = stdIn.nextInt();
		b = stdIn.nextInt();

		d = a/b;
		r = a%b;
		f = (double)a/b;

		System.out.println(d + " " + r + " " + f);
	}

}