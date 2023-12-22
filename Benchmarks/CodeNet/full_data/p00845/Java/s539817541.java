
import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			double[] sx = new double[n];
			double[] sy = new double[n];
			double[] sz = new double[n];

			for (int i = 0; i < n; i++) {
				sx[i] = sc.nextDouble();
				sy[i] = sc.nextDouble();
				sz[i] = sc.nextDouble();
			}
			int m = sc.nextInt();

			double[] tx = new double[m];
			double[] ty = new double[m];
			double[] tz = new double[m];
			double[] phi = new double[m];
			for (int i = 0; i < m; i++) {
				tx[i] = sc.nextDouble();
				ty[i] = sc.nextDouble();
				tz[i] = sc.nextDouble();
				double length = tx[i]*tx[i] + ty[i]*ty[i] + tz[i]*tz[i];
				length = Math.sqrt(length);

				tx[i] /= length;
				ty[i] /= length;
				tz[i] /= length;
				
				phi[i] = sc.nextDouble();
			}
			
			int ans= 0; 
			for(int i = 0; i < n ; i++){
				double length = sx[i]*sx[i]+sy[i]*sy[i]+sz[i]*sz[i];
				length = Math.sqrt(length);
				
				double x = sx[i]/length;
				double y = sy[i]/length;
				double z = sz[i]/length;
				
				for(int j = 0; j < m; j++){
					double v = x*tx[j]+y*ty[j]+z*tz[j];
					double v2 = Math.cos(phi[j]);
					if(v > v2){
						ans++;
						break;
					}
				}
				
			}
			System.out.println(ans);
			
		}
	}

	public static void main(String args[]) {
		Main m = new Main();
		m.run();
	}
}