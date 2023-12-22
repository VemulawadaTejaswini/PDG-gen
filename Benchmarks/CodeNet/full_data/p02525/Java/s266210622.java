import java.util.*;

/* No.10026 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNext("0")) {
			int n = sc.nextInt();
			int sum = 0;
			int[] data = new int[1000];
			for ( int i = 0; i < n; i++ ) {
				data[i] = sc.nextInt();
				sum+=data[i];
			}
			double ave = sum / n;
			sum = 0;
			for ( int i = 0; i < n; i++ )
				sum += Math.pow(data[i]-ave ,2 );
			double sqrt = Math.sqrt(sum/n);
			System.out.printf("%.8f\n",sqrt);
		}
	}
}