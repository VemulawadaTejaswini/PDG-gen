
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0)break;
			double[] s = new double[n];
			double sum = 0;
			for(int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = sum / n;
			double v = 0;
			for(int i = 0; i < n; i++) {
				v += (s[i] - m) * (s[i] - m);
			}
			v = v / n;
			System.out.println(Math.sqrt(v));
		}
		sc.close();
	}		
}

