import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r;
		double S,l;
		r=sc.nextInt();
		S=r*r*3.141592653589;
		l=r*2*3.141592653589;
		System.out.print(String.format("%.6f",S)+" ");
		System.out.println(String.format("%.6f", l));
		sc.close();
	}

}

