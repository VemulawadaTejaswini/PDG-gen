import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int s[] = new int[n];
		int t[] = new int[n];
		int x[] = new int[n];
		
		for(int i=0; i<n; i++){
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			s[i] = s[i] - x[i];
			t[i] = t[i] - x[i];
		}
		
		int d[] = new int[q];
		
		for(int i=0; i<q; i++){
			d[i] = sc.nextInt();
		}

		for(int i=0; i<q; i++){
			int pos = 100000001;
			for(int j=0; j<n; j++){
				if(s[j] <= d[i] && d[i] < t[j] && pos > x[j]){
					pos = x[j];
				}
			}
			
			System.out.println(pos > 100000000 ? -1 : pos);
		}
	}
}