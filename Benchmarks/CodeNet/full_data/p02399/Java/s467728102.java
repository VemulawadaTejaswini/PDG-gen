import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int A=a/b;
		int B=a%b;
		double C;
		C=1.0*a/b;
			System.out.print(A+" "+B+" ");
			System.out.println(String.format("%.5f",C));
	}
}
