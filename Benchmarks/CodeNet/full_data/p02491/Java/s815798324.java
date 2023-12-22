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

		d = (int)a/b;
		r = a%b;
		f = (float)a/b;
		

		System.out.println(d + " " + r + " " + f);
	}
}