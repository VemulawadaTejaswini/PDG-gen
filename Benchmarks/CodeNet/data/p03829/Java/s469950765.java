import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x[]=new long[n];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextLong();
		}
		long ans = 0;
		for(int i=1; i<n; i++) {
			long tmp = (x[i]-x[i-1])*a;
			if(tmp>b) {
				ans += b;
			}else {
				ans += tmp;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
