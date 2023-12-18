import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		long ans=1;
		long mod=1000000007;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int[] pp=new int[3];
		for(int i=0; i<n; i++){
			long count=0;
			int k=0;
			for(int j=0; j<3; j++){
				if(pp[j]==a[i]){
					k=j;
					count++;
				}
			}
			pp[k]++;
			ans=(ans*count)%mod;
		}
		System.out.println(ans);
	}
}
