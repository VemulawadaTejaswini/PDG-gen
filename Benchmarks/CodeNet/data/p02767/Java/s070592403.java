
import java.util.Scanner;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		
		long ans = Long.MAX_VALUE;
		for (int a=1;a<=100;a++) {
			long sum = 0;
			for (int i=0;i<n;i++) {
				sum+=((a-x[i])*(a-x[i]));
			}
			
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}

}