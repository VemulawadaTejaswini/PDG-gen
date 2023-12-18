import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x[] = new double[n + 1];
		double bt[] = new double[n + 1];
		int ye[] = new int[n + 1];
		String u[] = new String[n + 1];


		Arrays.fill(bt, 0);
		Arrays.fill(ye, 0);
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
			if (u[i].equals("BTC")) {
				bt[i] = x[i] * 380000;
			}else{
				ye[i]=(int)x[i];
			}
		}


		double btsum=sum(bt);
		int yesum=sum(ye);

		int btone=(int)btsum/1;
		btsum=btsum%1;
		yesum+=btone;
		System.out.println(yesum+btsum);
	}
	static int sum(int a[]){
	int n=a.length;
	int ans=0;
	for(int i=1;i<=n-1;i++){
		ans+=a[i];
	}
return ans;
	}

	static double sum(double a[]){
	int n=a.length;
	double ans=0;
	for(int i=1;i<=n-1;i++){
		ans+=a[i];
	}
return ans;
	}
}