import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x1,y1,x2,y2,x,y;
		double r;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x = Math.abs(x1 - x2);
		y = Math.abs(y1 - y2);
		x = x * x;
		y = y * y;
		r = Math.sqrt(x + y);
		System.out.println(r);
	}
}