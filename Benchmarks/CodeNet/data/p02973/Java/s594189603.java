import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans=n;
		long[] a=new long[n];
		long min=Long.MAX_VALUE;
		int of=0;
		int count=1;
		for(int i=0; i<n; i++){
			a[i] =sc.nextLong();
			if(i!=0){
				if(a[i]<=a[i-1]){
					if(min<a[i-1] && count-of>1){
						ans--;
						min=a[i];
						of=count;
					}else{
						if(min>a[i-1]){
							of=count;
						}
						min=Math.min(min,a[i-1]);
					}
					count++;
				}else{
					ans--;
				}
			}
		}
		if(min<a[n-1]){
			ans--;
		}
		System.out.println(ans);
	}
}


