import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while(true){
			cnt++;
			int n = sc.nextInt();
			if(n==0) break;
			
			double[] x = new double[n];
			double[] y = new double[n];
			for(int i=0;i<n;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			
			double sum = 0;
			double a, b, c, d;
			for(int i=1;i<=n-2;i++){
				a = x[i] - x[0];
				b = y[i] - y[0];
				c = x[i+1] - x[0];
				d = y[i+1] - y[0];
				sum += a*d - b*c;
			}
			
			System.out.println(cnt + " " + Math.abs(sum)/2);
		}	
	}	
}