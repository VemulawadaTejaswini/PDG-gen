import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[3];
		int[] b=new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		b[0]=sc.nextInt();
		b[1]=sc.nextInt();
		b[2]=sc.nextInt();
		int[] dp1=new int[n+1];
		for(int i=1; i<=n; i++){
			dp1[i]=i;
			for(int j=0; j<3; j++){
				if(i>=a[j]){
					dp1[i]=Math.max(dp1[i],dp1[i-a[j]]+b[j]);
				}
			}
		}
		long[] dp2=new long[dp1[n]+1];
		for(int i=1; i<=dp1[n]; i++){
			dp2[i]=i;
			for(int j=0; j<3; j++){
				if(i>=b[j]){
					dp2[i]=Math.max(dp2[i],dp2[i-b[j]]+a[j]);
				}
			}
		}
		System.out.println(dp2[dp1[n]]);
	}
}
