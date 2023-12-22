

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String i1[]=br.readLine().split(" ");
		int n=Integer.parseInt(i1[0]);
		int k=Integer.parseInt(i1[1]);
		
		long a[]=new long[n+1];
		int count=0;
		String line = br.readLine();
		while ( line != null  &&  !line.equals("")) {
		    
	    	int snack=Integer.parseInt(line);
			String users[]=br.readLine().split(" ");
			for(int i=0;i<users.length;i++)
			{
				a[Integer.parseInt(users[i])-1]++;
			}
			
			line=br.readLine();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
