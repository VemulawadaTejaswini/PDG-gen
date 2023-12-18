/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		List<Integer>[] adj = new ArrayList[m];
		for(int i=0;i<m;++i){
			 adj[i] = new ArrayList<>();
			 int k = sc.nextInt();
			 for(int j=0;j<k;++j){
			 	int s = sc.nextInt()-1;
			 	adj[i].add(s);
			 }
		}
		int[] p = new int[m];
		for(int i=0;i<m;++i) p[i] = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < (1<<n); ++i){
			boolean light = true;
			
			for (int j=0;j<m && light;++j){
				int on = 0;
				
				for(int bulb : adj[j])
				if(((i>>bulb)&1) == 1) ++on;
				
				on%=2;
				if(on!=p[j]) light = false;
				
			}
			
			if(light) ++ans;
			
		}
		
		System.out.println(ans);
 	}
}
