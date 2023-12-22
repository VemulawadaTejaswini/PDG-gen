import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int a,b,d,r;
		double f;
		Scanner br =new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		d=a/b;
		r=a%b;
		f=(double)a/b;
		System.out.print(d+" "+r+" ");
		System.out.printf("%.5f",f);
		System.out.println();
	}
}