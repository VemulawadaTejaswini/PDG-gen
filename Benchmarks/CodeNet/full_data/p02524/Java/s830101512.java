import java.util.Scanner;

class Main {
	public static void main(String args[]){
		int a,b,C;
		double sin,cos,S,L,h;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		C = scan.nextInt();
		sin = Math.sin(Math.toRadians(C));
		cos = Math.cos(Math.toRadians(C));
		
		S = a*b*sin/2;
		L = a+b+Math.sqrt(a*a+b*b-2*a*b*cos);
		h = b*sin;
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}