import java.util.Scanner;

public class Main
{
	private static int calcGCD(int a,int b)
	{
		if(b==0){
			return a;
		}else{
			return calcGCD(b,a%b);
		}
	}
	private static int calcLCM(int a,int b)
	{
		int gcd=calcGCD(a,b);
		if(a%gcd==0){
			return (a/gcd)*b;
		}else{
			return (b/gcd)*a;
		}
	}
	
	public static void main(String[] args)
	{
		int a,b;
		int gcd,lcm;
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			a=scan.nextInt();
			b=scan.nextInt();
			gcd=calcGCD(Math.max(a,b),Math.min(a,b));
			lcm=calcLCM(a,b);
			System.out.println(gcd+" "+lcm);
		}
		scan.close();
	}
}