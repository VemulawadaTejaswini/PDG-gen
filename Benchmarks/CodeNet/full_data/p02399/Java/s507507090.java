import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a/b);
		System.out.println(a%b);
		double f,x,z;
		x=a;
		z=b;
		f=x/z;
		System.out.format("%.5f",f);
		System.out.println();
	sc.close();
	}
}
