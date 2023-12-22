import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int C = sc.nextInt();
			double rad = (double)C / 180 * Math.PI;
			double S = a*b*Math.sin(rad)/2;
			double L = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
			double H = S*2/a;
			System.out.println(S);
			System.out.println(L);
			System.out.println(H);
		}
	}
}
