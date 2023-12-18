/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    String[] line = br.readLine().split(" ");
		    A.add(Integer.parseInt(line[0]));
		    B.add(Integer.parseInt(line[1]));
		}
		
		int ans = Integer.MAX_VALUE;
		start:for(int j=0;j<ans;j++){
		    int tmp_ans = B.get(n-1)*j;
    		for(int i=n-1;i>=0;i--){
    		    int a = A.get(i);
    		    int b = B.get(i);
    		    if(b!=1)
        		    tmp_ans += b-(a+tmp_ans)%b;
        		if(tmp_ans > ans){
        		    continue start;
        		}
    		}
    		ans = Math.min(tmp_ans,ans);
		}
		System.out.println(ans);
	}
}