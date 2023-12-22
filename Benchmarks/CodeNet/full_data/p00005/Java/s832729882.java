import java.util.Scanner;
public class Main{
	static int gcd(int a,int b){
		while(a!=b){
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	static void lcm(int a,int b,int g){
		System.out.println(g+" "+(a*b/g));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int g=0;
		g = gcd(a,b);
		lcm(a,b,g);
		scan.close();
	}

}