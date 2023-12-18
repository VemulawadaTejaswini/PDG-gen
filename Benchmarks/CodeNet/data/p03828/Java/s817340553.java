import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static final int N_MAX=1000;
	private static int[] a=new int[N_MAX+1];
	public static void main(String[] args){
		for(int i=2;i<=n;i++){
			int num=i;
			int j=2;
			while(num>1){
				if(num%j==0){
					a[j]++;
					num=num/j;
				}
				else j++;
			}
		}
		long ans=1;
		for(int j=2;j<=N_MAX;j++){
			ans=(ans*(a[j]+1))%1000000007;
		}
		System.out.println(ans);
	}
}