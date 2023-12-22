import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		double[] x = new double[n];
		double[] y = new double[n];
		
		for(int i = 0; i < n; i++){
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++){
			if((Math.sqrt((x[i]*x[i]) + (y[i]*y[i]))) <= d){
				count++;
			}
		}
		System.out.println(count);
	}
}
