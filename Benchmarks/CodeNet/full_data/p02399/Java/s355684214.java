import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b;
		int d,r;
		double f;
		
		a = in.nextInt();
		b = in.nextInt();
		
		d = a/b;
		r = a%b;
		f = (double)a/(double)b;
		
		System.out.println(d+" "+r+" "+f);
	}
}