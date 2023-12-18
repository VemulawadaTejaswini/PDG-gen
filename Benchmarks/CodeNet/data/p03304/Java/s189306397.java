import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble();
		double m=sc.nextDouble();
		double d=sc.nextDouble();
		double a=2*(n-d)*(m-1);
		if(d==0){
			a=n*(m-1);
		}
		System.out.println(a/(n*n));
	}
}
