import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int sumb=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			sumb+=b[i];
		}
		
		long c[]=new long[100001];
		
		for(int i=0;i<n;i++) {
			c[a[i]]+=b[i];
		}
		
		int ans=0;
		while(k>0) {
			ans++;
			k-=c[ans];
		}
		System.out.println(ans);
	}
}
