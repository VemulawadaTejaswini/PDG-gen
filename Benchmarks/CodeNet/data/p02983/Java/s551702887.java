
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long l=scn.nextLong();
		long r=scn.nextLong();
		if(2019<l||r<2019) {
			l=l%2019;
			r=r%2019;
			Long min=Long.MAX_VALUE;
		
			for(long i=l;i<r;i++) {
				for(long j=i+1;j<=r;j++) {
					long x=i*j;
					if(x<min) {
						min=x;
					}
				}
			}
			System.out.println(min);
		}
		else {
			System.out.println(0);
		}
	}

}
