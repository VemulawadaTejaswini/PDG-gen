import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long res = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		int i=0,j=0;
		boolean sol = false;
		while(i<n && j<m) {
			if(k<a[i] && k<b[j]) {
				sol=true;
				break;
			}
			if(a[i]<=b[j]) {
				res++;
				k=k-a[i];
				i++;
			}
			else {
				res++;
				k=k-b[j];
				j++;
			}
		}
		if(sol!=true) {
			if(i==n) {
				while(j<m) {
					if(b[j]<=k) {
						res++;
						k=k-b[j];
						j++;
					}
					else
						break;
				}
			}
			else if(j==m) {
				while(i<n) {
					if(a[i]<=k) {
						res++;
						k=k-a[i];
						i++;
					}
					else
						break;
				}
			}
		}
//		while(k>0) {
//			if(i<n && j<m && k<a[i] && k<b[j])
//				break;
//			else if(i==n && j==m)
//				break;
//			else if(i==n && k<b[j])
//				break;
//			else if(j==m && k<a[i])
//				break;
//			else if(i<n && j<m && a[i]>=b[j])
//			{
//				k=k-b[j];
//				j++;
//				res++;
//			}
//			else if(i<n && j<m && a[i]<=b[j]) {
//				k=k-a[i];
//				i++;
//				res++;
//			}
//			else if(i==n && k>=b[j]) {
//				k=k-b[j];
//				j++;
//				res++;
//			}
//			else if(j==m && k>=a[i]) {
//				k=k-a[i];
//				i++;
//				res++;
//			}
//		}
		System.out.println(res);
		sc.close();

	}
}
