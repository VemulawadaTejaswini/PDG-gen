import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(),k=sc.nextInt();
		int[]a  = new int[n];
		int[]sum=new int[n+1];
		for(int i =0;i<n;i++){
			a[i]=sc.nextInt();
			sum[i+1]=sum[i]+a[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i=k;i<n;i++){
			max=Math.max(max, sum[i]-sum[i-k]);
		}
		System.out.println(max);
		
	}

}