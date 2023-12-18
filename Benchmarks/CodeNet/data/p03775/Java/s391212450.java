import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextLong();
		
		long a = n;
		
		for(long i = 1; i*i <= n; i++) {
			long l = i*i;
			if(Math.sqrt(n-l)==(long)Math.sqrt(n-l)) {
				a = i;
			}
		}
		
		int cnt = 0;
		while(a>0) {
			cnt++;
			a /= 10;
		}
		System.out.println(cnt);
	}

}
