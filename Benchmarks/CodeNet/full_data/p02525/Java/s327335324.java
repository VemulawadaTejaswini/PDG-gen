import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[], sum, i;
		double sum2;
		double m;
		while(true){
			n = sc.nextInt();
			if (n == 0) break;
			sum = 0;
			a = new int[n];
			for(i = 0; i < n; i++){
				a[i] = sc.nextInt();
				sum += a[i];
			}
			m = (double)sum / n;
			sum2 = 0;
			for(i = 0; i < n; i++){
				sum2 += (m - a[i]) * (m - a[i]);
			}
			System.out.printf("%.8f\n", Math.sqrt((double)sum2 / n));
		}
	}
}