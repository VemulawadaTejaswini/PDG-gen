import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Double S,L,H;
		int a,b;
		double angleC;
		final double PI = 3.14159265358979323846;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		angleC=scan.nextDouble()/180*PI;
		scan.close();
		S=a*b*Math.sin(angleC)/2;
		L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(angleC));
		H=b*Math.sin(angleC);
		System.out.println(S + "\n" + L + "\n" + H);
	}
}
