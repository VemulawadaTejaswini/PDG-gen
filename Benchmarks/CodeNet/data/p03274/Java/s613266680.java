import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long[] x=new long[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextLong();
		}
		long ans=Long.MAX_VALUE;
		for(int i=0; i<=n-k; i++){
			ans=Math.min(ans,Math.min(Math.abs(x[i]),Math.abs(x[i+k-1]))+x[i+k-1]-x[i]);
		}
		System.out.println(ans);
	}
}
