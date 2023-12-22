import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double a=scan.nextInt();
		double b=scan.nextInt();
		double C=scan.nextInt();
		C=Math.PI*C/180.0;
		double S=a*b*Math.sin(C)/2.0;
		double L=a+b+Math.sqrt(a*a+b*b-a*b*Math.cos(C));
		double h=b*Math.sin(C);
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
		scan.close();
	}
}