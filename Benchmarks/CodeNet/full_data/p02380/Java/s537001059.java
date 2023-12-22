import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		c=Math.toRadians (c);
		double S=((a*b)*Math.sin(c))/2;
		double L=a+b+Math.sqrt((Math.pow(a,2)+Math.pow(b, 2)-(2*a*b*Math.cos(c))));
		double h=b*Math.sin(c);
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);

		scanner.close();
	}
}
