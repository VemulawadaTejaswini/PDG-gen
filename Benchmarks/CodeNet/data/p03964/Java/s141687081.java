import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double A=1;
		double B=1;
		for(int i=0; i<n; i++){
			double t=sc.nextDouble();
			double a=sc.nextDouble();
			double tx=Math.ceil(A/t);
			double ax=Math.ceil(B/a);
			double x=Math.max(tx,ax);
			A=t*x;
			B=a*x;
		}
		System.out.println((int)(A+B));
	}
}
