import java.util.Scanner;
 
public class Main {
 
	static int ans;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = 1000000000 * 1000000000;
		ans = 0;
		double[] a = new double[n];
		for(int i =0; i<n;i++) {
			a[i] = sc.nextDouble();
			a[i] = a[i] * 1000;
//			System.out.println(a[i]);
		}
		for(int i = 0; i < (a.length-1);i++) {
			for(int j = i+1; j < a.length;j++) {
				double variable = a[i] * a[j];
				variable = variable / 1000000;
//				long a_i = (long) (a[i] * 1000000000);
//				long a_j = (long) (a[i] * 1000000000);
//				long variables = a_i * a_j;
//				double variable = (double)variables / m;
				if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)) {
				    ans++;
//				    System.out.println(variable);
				}
			}
		}
		
		
		
		System.out.println(ans);
			
	}
	
}