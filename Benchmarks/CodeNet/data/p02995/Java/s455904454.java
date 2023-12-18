import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();

		long count;
		long ac=(a-1)/c;
		long bc=b/c;
		long cc=bc-ac; 
		long ad=(a-1)/d;
		long bd=b/d;
		long dd=bd-ad; 
		long max=2;
		for(long i=c;i>=1;i--){
			if(c%i==0 && d%i==0){
				max=i;
				break;
			}
		}
		long min=c*d/max;

		long acd=(a-1)/min;
		long bcd=b/min;
		long abcd=bcd-acd; 
		System.out.println(b-a+1-cc-dd+abcd);


	}
}
