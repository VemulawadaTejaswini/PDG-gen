import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=Math.max(x,y);
		int b=Math.min(x,y);
		System.out.println(gcd(a,b));
	}
	static int gcd(int a, int b){
		int r;
		while(b>0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

}