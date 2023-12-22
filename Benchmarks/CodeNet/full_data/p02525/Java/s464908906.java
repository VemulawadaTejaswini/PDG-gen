import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[], sum, i;
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
			sum = 0;
			for(i = 0; i < n; i++){
				sum += (m - a[i]) * (m - a[i]);
			}
			System.out.println(Math.sqrt((double)sum / n));
		}
	}
}