import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static int checkValidity(long a, 
			long b, long c) 
	{ 
		// check condition 
		if (a + b <= c || a + c <= b || b + c <= a) 
			return 0; 
		else
			return 1; 
	} 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		int res = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]!=arr[j]) {
					for(int k=j+1;k<n;k++) {
						if(arr[j]!=arr[k] && arr[k]!=arr[i]) {
							if(checkValidity(arr[i],arr[j],arr[k])==1)
								res++;
						}
					}
				}
			}
		}
		System.out.println(res);
		sc.close();

	}
}
