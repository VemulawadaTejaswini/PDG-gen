import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] sum = new int[m];
		
		int ans = 0;
		
		for (int i=0;i<m;i++) {
			sum[i] = sc.nextInt();
			ans+=sum[i];
		}

		if(n-ans < 0) {
			System.out.println(-1);
		} else {
			System.out.println(n-ans);
		}
		

	}
}

