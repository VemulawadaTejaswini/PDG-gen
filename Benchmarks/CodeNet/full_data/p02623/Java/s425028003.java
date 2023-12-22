import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n+1];
		long[] b=new long[m+1];
		for(int i=1; i<=n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=1; i<=m; i++){
			b[i]=b[i-1]+sc.nextInt();
		}
		int bIndex=m;
		int ans=0;
		for(int i=0; i<=n; i++){
			k-=a[i];
			if(k<=0){
				break;
			}
			int leftTime=k;
			while(leftTime<b[bIndex]){
				bIndex--;
			}
			ans=Math.max(ans,i+bIndex);
		}
		System.out.println(ans);
	}
}
