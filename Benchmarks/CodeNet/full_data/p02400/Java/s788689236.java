import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double r,S,l;
		r=sc.nextDouble();
		S=(r*r)*Math.PI;
		l=(r*2)*Math.PI;
		System.out.print(String.format("%.6f", S)+" ");
		System.out.println(String.format("%.6f", l));
		sc.close();
	}
}

