import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    private static BufferedReader br;
    private static StringTokenizer strz; 
    
	public static void main (String[] args) throws java.lang.Exception {
		br=  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		strz = new StringTokenizer(br.readLine());
		
		long sum = 0;
		int[] count = new int[100001];
		while(strz.hasMoreTokens()){
		    int x = Integer.parseInt(strz.nextToken());
		    sum += x;
		    ++count[x];
		}
		int q = Integer.parseInt(br.readLine());
		
		while(q-- > 0){
		    strz = new StringTokenizer(br.readLine());
		    int b = Integer.parseInt(strz.nextToken());
		    int c = Integer.parseInt(strz.nextToken());
		    
		    sum -= count[b]*b;
		    count[c] += count[b];
		    sum += count[b]*c;
		    count[b] = 0;
		    
		    System.out.println(sum);
		}
	}
}