import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = Math.abs(scan.nextLong());
		long k = scan.nextLong();
		long d = scan.nextLong();
		scan.close();
		long ans ;
		if(x/d>=k) { x = x-d*k;}
		else {
			long e = x/d;
			long k2 = k - e;
			x -= e*d;
			if(k2%2==1) { x = Math.abs(x-d);}
		}
		ans = x;
		System.out.println(ans);
	}
}