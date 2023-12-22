import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		double r=i.nextInt();
		double s=r*r*Math.PI;
		double l=r*2*Math.PI;
		System.out.printf("%.6f %.6f\n",s,l);
	}
}