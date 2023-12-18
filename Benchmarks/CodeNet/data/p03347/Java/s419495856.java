import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(i==0 && a[0]!=0){
				System.out.println(-1);
				return;
			}
		}
		for(int i=1; i<n; i++){
			if(a[i-1]>=a[i]){
				ans+=a[i-1];
			}
		}
		ans+=a[n-1];
		System.out.println(ans);
	}
}
