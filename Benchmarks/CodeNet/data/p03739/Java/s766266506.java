import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans=0;
		//long ans2=0;

		int[] f = new int[n];
		for(int i=0;i<n;i++) f[i] = sc.nextInt();
		sc.close();

		long sum1 = f[0];
		long sum2 = f[0];
		for(int i=0;i<n-1;i++) {
			sum2 += f[i+1];
			if(sum1*sum2 > 0) {
				ans += Math.abs(sum2)+1;
				if(sum1 >0) sum2 = -1;
				else sum2 = 1;
			}else if(sum2 == 0) {
				ans += 1;
				if(sum1 > 0) sum2 = -1;
				else sum2 = 1;
			}
			sum1 = sum2;
		}

		System.out.println(ans);
	}
}
