import java.util.*;

public class Main{
	public static void main(String[] args){

		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double d1, sum2, d2, sum3, d3, d4;
		
		for(int i = 0; i < n; i++){
			x[i] = scan.nextDouble();
		}
		for(int i = 0; i < n; i++){
			y[i] = scan.nextDouble();
		}
		for(int i = 0; i < n; i++){
			d1 += Math.abs(x[i] - y[i]);
			sum2 += Math.pow((Math.abs(x[i] - y[i])), 2);
			sum3 += Math.pow((Math.abs(x[i] - y[i])), 3);
			d4 = Math.max(d4, Math.abs(x[i] - y[i]));
		}		
		d2 += Math.sqrt(sum2);
		d3 += Math.cbrt(sum3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}
}