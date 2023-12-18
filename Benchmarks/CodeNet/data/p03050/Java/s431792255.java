
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long ans = 0;
		for(long i = 1;;i++) {
			if((N-i)%i==0) {
				long m = (N-i)/i;
				if(m<=i)break;
				ans+=m;
			}
		}
		System.out.println(ans);
	}

}
