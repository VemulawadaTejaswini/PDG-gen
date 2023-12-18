import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int p[]=new int[n];
		double x1000[]=new double[1000];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		for(int i=0;i<1000;i++) {
			x1000[i]=0;
		}
		double max=0;
		for(int i=0;i<=n-k;i++) {
			double ans=0;
			for(int j=i;j<i+k;j++) {
				if(x1000[p[j]-1]==0) {
					double a=0;
					for(int l=1;l<=p[j];l++) {
						a += ((double)1/p[j])*l;
					}
					x1000[p[j]-1]=a;
					ans+=a;
				}else {
					ans += x1000[p[j]-1];
				}
			}
			if(max<ans)max=ans;
		}

		System.out.println(max);
	}
}