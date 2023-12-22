import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String[]	s	= new String[2];
		int			a,b,d,r;
		double		f;

		Scanner		sc	= new Scanner(System.in);
		s = sc.nextLine().split(" ");
		sc.close();

		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);

		d = intDiv(a,b);
		r = rem(a,b);
		f = doubleDiv(a,b);

		System.out.println(d + " " + r + " " + f);
	}
	
	public static int intDiv(int x,int y){
		if(y==0) return 0;
		return x/y;
	}
	public static int rem(int x,int y){
		if(y==0) return 0;
		return x%y;
	}
	public static double doubleDiv(double x,double y){
		if(y==0) return 0;
		return x/y;
	}
}