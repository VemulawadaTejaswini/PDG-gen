import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
		sc.close();
	}
	static int gcd(int a,int b){
		int c=Math.max(a, b);
		int d=Math.min(a, b);
		while(c%d!=0){
			int e=c%d;
			c=d;
			d=e;
		}
		return d;
	}
	static int lcm(int a,int b){
		int gcd=gcd(a,b);
		int resa=a/gcd;
		int resb=b/gcd;
		int lcm=resa*resb*gcd;
		return lcm;
	}
}