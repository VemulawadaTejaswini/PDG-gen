import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long max=1;
		int ans=0;
		if(N>1) {
			while(N!=1) {
				for(long i=max+1;i<N+1;i++) {
					if(N%i==0) {
						ans++;
						max=i;
						N=N/i;
						break;
					}
				}
				
			}
		}
		System.out.println(ans);
	}
}
