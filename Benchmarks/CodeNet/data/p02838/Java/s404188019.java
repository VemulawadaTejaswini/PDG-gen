import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		long  a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextLong();
		}
		scan.close();

		double sum=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
					sum+=a[i]^a[j];
			}
		}
		double x=1000000000+7;
		double ans = sum%x;
		System.out.println(ans);
	}

}