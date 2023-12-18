
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=1;
		long y=n;
		for(long i=1;i<n/2;i++) {
			if(i>y)
				break;
			if(n%i==0) {
				x=i;
				y=n/i;
			}
			n=n/i;

		}

		System.out.println(x-1+y-1);

	}

}
