import java.util.Scanner;
public class Triangle {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double a=scan.nextInt();
		double b=scan.nextInt();
		double C=scan.nextInt();
		C=Math.PI*C/180.0;
		double S=a*b*Math.sin(C)/2.0;
		double L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
		double h=b*Math.sin(C);
		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);
		scan.close();
	}
}