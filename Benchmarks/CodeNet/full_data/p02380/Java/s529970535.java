import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double S, L, h;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		S = a * b * Math.sin(Math.toRadians(c)) / 2.0;
		L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c)));
		h = b * Math.sin(Math.toRadians(c));
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}