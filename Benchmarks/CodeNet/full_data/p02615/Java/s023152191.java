import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] v=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			v[i]=a[i];
		}
		
		Arrays.sort(a);Arrays.sort(v);
		
		int ans=0;
		
		for(int i=n-1;i>=0;i--) {
			if(i==0)continue;
			if(i==1)ans+=v[0];
			else ans+=v[1];
			v[0]=v[1]=a[i];
			Arrays.sort(v);		
			
		}
	    System.out.println(ans);
	}
}
