

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        
        int n = Integer.parseInt(str);
        str = br.readLine().trim();
        StringTokenizer stk = new StringTokenizer(str);
        int[] a = new int[n+3];a[0]=0;a[a.length-1]=0;
        for(int i=1;i<=n;i++) {
    	  a[i] = Integer.parseInt(stk.nextToken()); 
        }
        int count=0;
        for(int i=1;i<a.length-1;i++) {
        	long sum = 0l;
        	for(int j=1;j<a.length-1;j++) {
        		if(i==j) {
        			sum+=Math.abs(a[j+1]-a[j-1]);j++;
        		}
        		else sum+=Math.abs(a[j]-a[j-1]);
        	}
        	if(count<n) {System.out.println(sum);count++;}
        	else return;
        }
       // System.out.println(total);
        	
        
	}

}
