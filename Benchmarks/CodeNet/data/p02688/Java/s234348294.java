

import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String i1[]=br.readLine().split(" ");
		int n=Integer.parseInt(i1[0]);
		int k=Integer.parseInt(i1[1]);
		
		long a[]=new long[n+1];
		int count=0;
		String line = br.readLine();
		while ( line != null  &&  !line.equals("")) {
		    
	    	int d=Integer.parseInt(line);
			String s=br.readLine();
			if(a[d]>0)
			{
				//
			}
			else
			{
				count++;
			}
			a[d]++;
			line=br.readLine();
		}
		
		System.out.println(n-count);
	}

}
