import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a;
			int[] dp=new int[100010];
			int n=sc.nextInt();
			int ll=0;
			for(int i=0; i<n; i++) {
				a=sc.nextInt();
				if(i==0) {
					dp[1]=a;
				}
				else {
					if(dp[ll]<a) {
						ll++;
						dp[ll]=a;
					}
					else {
						for(int l=1; l<=ll; l++) {
							if(dp[l]>=a) {
								dp[l]=a;
							}
						}
					}
				}
			}
			System.out.println(ll);

		}
	}
}
