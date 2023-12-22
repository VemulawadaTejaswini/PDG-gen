import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double[] diff = new double[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
		
		for (double p = 1; p <=3; p++) {
			double sum = 0;
			for (int i = 0; i < n; i++) {
				sum+= Math.pow(Math.abs(x[i]-y[i]), p);
				diff[i] = Math.abs(x[i]-y[i]);
			}
			
			System.out.println(Math.pow(sum, 1/p));
		}
		
		double maxValue = diff[0];
		for(int i=1;i < n;i++){
			if(diff[i] > maxValue){
				maxValue = diff[i];
			}
		}
		
		
		System.out.println(maxValue);
		
			
	}
}
