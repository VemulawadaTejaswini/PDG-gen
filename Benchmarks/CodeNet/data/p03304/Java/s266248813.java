import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long d = in.nextLong();
		long numPattern = calculatePattern(n,d);
		double ave = (double)numPattern * (m-1)/n/n;
		System.out.println(ave);
	}
	
	public static long calculatePattern(long n,long d) {
		if(d==0) {
			return n;
		}else {
			return 2*(n-d);
		}
	}

}