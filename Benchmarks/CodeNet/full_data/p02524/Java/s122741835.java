import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a,b,C;
		double S,L,h;
		a = sc.nextInt();
		b = sc.nextInt();
		C = sc.nextInt();
		S = 0.5*a*b*Math.sin(Math.toRadians(C));
		L = a + b + Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(Math.toRadians(C)));
		h = (2.0*S) / a;
		System.out.printf("%f\n%f\n%f",S,L,h);
	}
}