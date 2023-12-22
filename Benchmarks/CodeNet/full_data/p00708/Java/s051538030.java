import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		double xs[] = new double[n];
		double ys[] = new double[n];
		double zs[] = new double[n];
		double rs[] = new double[n];
		for(int i = 0; i < n; i++){
			xs[i] = sc.nextDouble();
			ys[i] = sc.nextDouble();
			zs[i] = sc.nextDouble();
			rs[i] = sc.nextDouble();			
		}
		
		double distance[] = new double[n];
		
		double ans = 0;
		int now = 0;
		
		distance[0] = -1;
		for(int i = 1; i < n; i++){
			double d = Math.sqrt(
							(xs[0]-xs[i]) * (xs[0]-xs[i]) +
							(ys[0]-ys[i]) * (ys[0]-ys[i]) +
							(zs[0]-zs[i]) * (zs[0]-zs[i])
						  );
			d = d - rs[0] - rs[i];
			if(d < 0) d = 0;
			distance[i] = d;
		}
		
		for(int i = 1; i < n; i++){
			int small = -1;
			for(int k = 0; k < n; k++){
				if(distance[k] != -1 && (small == -1 || distance[k] < distance[small])){
					small = k;
				}
			}
			ans += distance[small];
			distance[small] = -1;
			
			for(int k = 0;k < n; k++){
				if(distance[k] != -1){
					double d = Math.sqrt(
							  (xs[small]-xs[k]) * (xs[small]-xs[k]) +
							  (ys[small]-ys[k]) * (ys[small]-ys[k]) +
							  (zs[small]-zs[k]) * (zs[small]-zs[k])
							);
					d = d - rs[small] - rs[k];
					if(d < 0) d = 0;
					if(d < distance[k]) distance[k] = d;
				}
			}
		}
		System.out.printf("%.4f\n", ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}