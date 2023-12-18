
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		long ans=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(i-j==a[i]+a[j]){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
