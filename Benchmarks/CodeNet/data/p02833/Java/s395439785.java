import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static long fac(long n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fac(n-2);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		//System.out.println(fac(n));
		if(n%2!=0) System.out.println("0");
		else {
			long nn = n;
			long nnn = n;
			long nnnn = n;
			long res = 0;
			while (nn>0 ) {
				res += nn / 5;
				nn /= 5;
			}
			System.out.println(res/2);
			/*while (nnn>0) {
				res += nnn / 50;
				nnn /= 50;
			}
			System.out.println(res);
			while (nnnn>0 ) {
				res += nnnn / 1250;
				nnnn /= 1250;
			}
			System.out.println(res);
			while (n>0) {
				res += n / 250;
				n /= 250;
			}
			System.out.println(res);*/
		}
		//131519274376417233
		//1000000000000000000
	}
}
