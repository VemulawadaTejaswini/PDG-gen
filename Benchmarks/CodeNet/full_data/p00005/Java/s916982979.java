import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		Scanner scn = new Scanner(System.in);
		try{
			while(true){
				long alpha = scn.nextInt();
				long beta = scn.nextInt();
				long gcd = gcd(alpha,beta);
				long lcm = alpha /gcd * beta;
				System.out.println(gcd + " " + lcm);
			}
		}catch(Exception e){

		}

	}
	public static long gcd(long alpha,long beta){
		long x = Math.max(alpha,beta);
		long y = Math.min(alpha,beta);
		long z;
		while(y != 0){
			z = y;
			y = x % y;
			x = z;
		}
		return x;
	}
}