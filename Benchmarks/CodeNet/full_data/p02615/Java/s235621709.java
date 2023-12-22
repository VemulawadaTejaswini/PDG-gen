import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		long ans=a[n-1];
		int ind=n-2;
		for(int i=n-3; i>=0; i--){
			if(ind-i>2){
				ind--;
			}
			ans+=a[ind];
		}
		System.out.println(ans);
	}
}
