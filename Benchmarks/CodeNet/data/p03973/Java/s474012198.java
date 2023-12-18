import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		ans+=a[0]-1;
		int k=2;
		for(int i=1; i<n; i++){
			if(a[i]==k){
				k++;
				continue;
			}
			ans+=(a[i]-1)/k;
		}
		System.out.println(ans);
	}
}
