

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sin=new Scanner(System.in);
	    int n= sin.nextInt();
	    int k= sin.nextInt();
	    int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]= sin.nextInt();
		}
		int sum=0;
		for (int i = 0; i < k; i++) {
			sum+=a[i];
		}
		int sumb=sum;
		int fi=0;
		for (int i = k; i <n ; i++) {
			sumb=sumb-a[i-k]+a[i];
			if(sumb>sum) {
				sum=sumb;
				fi=i-k+1;
			}
		}
		double ans=0;
		for (int i = fi; i <fi+k ; i++) {
			double div=a[i]*(a[i]+1)*1.0/2/a[i];
			ans+=div;
		}
		System.out.printf("%.12f",ans);
    }
}
