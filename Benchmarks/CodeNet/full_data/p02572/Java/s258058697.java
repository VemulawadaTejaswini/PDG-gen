import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<=n-1;i++) {
			a[i]=sc.nextLong();
		}
		long s=0;
		for(int i=0;i<=n-2;i++) {
			for(int j=1;j<=n-1;j++) {
				s+=a[i]*a[j]%1000000007;
			}
		}
		System.out.println(s);
		sc.close();
	}
}