import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long ans=1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]==0) {
				ans=0;
			}
		}
				for(int i=0;i<n;i++) {
					ans*=a[i];
					long x=(long)(Math.pow(10, 18));
					if(ans>x) {
						ans=-1;
						break;
					}
			}
				System.out.println(ans);
	}
}
