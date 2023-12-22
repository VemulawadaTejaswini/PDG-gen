import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int t = sc.nextInt();
			double[] b = new double[t+1];
			for(int i=1;i<=t;i++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				double k = 0;
				int a = 0;
				for(int j=1;j<=m;j++) {
					int v = sc.nextInt();
					double r = sc.nextDouble();
					a = v;
					k += r;
					b[i] += (double)v*r;
				}
				if(m==1)
					b[i] = a;
				else
					b[i] += (double)(1-k)*b[i];
			}
			int p = sc.nextInt();
			int q = sc.nextInt();
			double d = 0;
			double k = 0;
			for(int j=1;j<=q;j++) {
				int v = sc.nextInt();
				double r = sc.nextDouble();
				k += r;
				if(q==1) {
					d = v;
					break;
				}
				else
					d += (double)v*r;
			}
			if(q!=1)
				d += (double)(1-k)*d;
			
			
			
			boolean flag = false;
			for(int i=1;i<=t;i++) {
				if(d<b[i]) {
					flag = true;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	
	}
}
