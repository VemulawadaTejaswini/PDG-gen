import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		double ave = 0.0;
		
		n = sc.nextInt();
		a= new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			ave += a[i];
		}
		ave /= n;
		sc.close();
		
		
		
		double a2[];
		a2 = new double[n];
		
		for(int i = 0; i < n; ++i)
			a2[i] = Math.abs(ave - (double)a[i]);
		
		double min = 1000;
		for(double i:a2)min = Math.min(min,  i);
		
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			if(min == a2[i]) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
