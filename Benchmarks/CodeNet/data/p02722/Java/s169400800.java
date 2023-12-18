import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long k = n;
		long tmp = n;
		
		long count=0;
		for(long i=2; i<=k; i++) {
			n = tmp;
			while(n > 0) {
				if(n%i==0) {
					n /= i;
				}else {
					n -= i;
				}
				if(n==1)
					++count;
			}
		}
		
		System.out.println(count);
	}

}
