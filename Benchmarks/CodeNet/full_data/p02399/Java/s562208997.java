import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		double A=(double)a;
		double B=(double)b;
		System.out.printf("%d %d %f",a/b,a%b,A/B);
		
	}
}
