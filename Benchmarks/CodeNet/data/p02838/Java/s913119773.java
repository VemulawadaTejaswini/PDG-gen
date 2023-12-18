import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();

		double sum=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(a[i]!=a[k] && a[j]!=a[k]) {
						sum+=a[k];
					}
				}
			}
		}
		double x=1000000000+7;
		double ans = sum%x;
		System.out.println(ans);
	}

}