import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Double[] x = new Double[N];
		Double[] y = new Double[N];
		Double[] k = new Double[N*(N-1)/2];
		for (int i=0;i<N;i++) {
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
		}

		int cnt=0;
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				if (x[j]-x[i]==0) {
					k[cnt]=2000000000.0;
				} else {
					k[cnt]=(y[j]-y[i])/(x[j]-x[i]);
				}
				cnt++;
			}
		}
		Arrays.sort(k);
		int tmp=0;
		int max=0;
		for (int i=0;i<N*(N-1)/2-1;i++) {
			if (Math.abs(k[i]-k[i+1])<0.00000000001) {
				tmp++;
				max=Math.max(max,tmp);
			} else {
				tmp=0;
			}
		}
		if (max!=N-1) {
			System.out.println(N-(max+1));
		} else {
			System.out.println(1);
		}
	}
}