import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		for(;;){


			int n = sc.nextInt(),k=sc.nextInt();
			if(n+k==0)break;
			long[]a  = new long[n];
			long[]sum=new long[n+1];
			for(int i =0;i<n;i++){
				a[i]=sc.nextInt();
				sum[i+1]=sum[i]+a[i];
			}
			long max=Long.MIN_VALUE;
			for(int i=k;i<n+1;i++){
				max=Math.max(max, sum[i]-sum[i-k]);
			}
			System.out.println(max);

		}

	}
}