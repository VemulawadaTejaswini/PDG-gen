
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long ans=keta(n);
		for(long i=2; i*i<=n; i++) {
			if(n%i!=0) continue;
			long k = Math.max(keta(i), keta(n/i));
			if(ans>k) {
				ans = k;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private long keta(long x) {
		if((x/10)==0) {
			return 1;
		}
		return keta(x/10)+1;
	}


}


