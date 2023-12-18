import java.util.Scanner;

public class abc91a {
	public static void main(String [] adf){
		Scanner in = new Scanner (System.in);
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if(a+b>=c) System.out.println("Yes");
		else System.out.println("No");
	}
}
