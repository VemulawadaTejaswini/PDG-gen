import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		double a;
		double b;
		double  d;
		double  r;
		double  f;
		
		a=scan.nextInt();
		b=scan.nextInt();
		d=a/b;
		r=a%b;
		f=a/b;
		System.out.printf("%d %d %f \n", (int)d,(int)r,f);
