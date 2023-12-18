import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		double a=stdin.nextInt();
		double b=stdin.nextInt();
		double x=(a+b)/2;
		int y=(int)(a+b)/2;
		
//		System.out.println(x);
//		System.out.println(y);
		if(x==y)
			System.out.println(y);
		else if(x!=y)
			System.out.println(y+1);
	}

}
