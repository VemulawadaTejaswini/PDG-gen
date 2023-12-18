import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		int sum1=0,sum2=0;
		for (int i = 0; i < n; i++) {
			sum1=0;
			sum2=0;
			for(int j=0;j<i;j++) {
				sum1 += w[j];
			}
			for (int j = i; j < n; j++) {
				sum2 += w[j];
			}
			ans = Math.min(Math.abs(sum1-sum2), ans);
		}
		System.out.println(ans);
		
	}

}
