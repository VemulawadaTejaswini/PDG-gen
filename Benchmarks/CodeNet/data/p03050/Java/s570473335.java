import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long r=0;
		for(long i=1;i*i<n;++i) {
			if(n%i==0) {
				if(i<n/i)
					r+=n/i-1;
				else
					r+=i;
			}
		}
		System.out.println(r);
	}
}