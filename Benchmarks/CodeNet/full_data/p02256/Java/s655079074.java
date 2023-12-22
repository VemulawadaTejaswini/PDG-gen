import java.util.Scanner;

public class Main {
	static int gcd(int a, int b){
		int c;
		while (b>0){
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x>=y){
			int n =gcd(x,y);
			 System.out.println(n);
	} else if (y>x){
		int n =gcd(y,x);
			 System.out.println(n);
	}
	}
}
