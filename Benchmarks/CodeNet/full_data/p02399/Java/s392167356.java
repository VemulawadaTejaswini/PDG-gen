import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		a = sc.nextInt();
		b = sc.nextInt();
		d=a/b;
		r=a%b;
		double f=a/b;
		System.out.print(d+" "+r+" ");
		System.out.printf("%.8f\n", f);
	}

}