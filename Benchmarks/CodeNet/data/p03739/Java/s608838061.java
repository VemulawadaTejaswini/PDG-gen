import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;

		int sum1 = sc.nextInt();
		int sum2 = sum1;
		for(int i=0;i<n-1;i++) {
			sum2 += sc.nextInt();
			if(sum1*sum2 > 0) {
				ans += Math.abs(sum2)+1;
				if(sum2 >0) sum2 = -1;
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
