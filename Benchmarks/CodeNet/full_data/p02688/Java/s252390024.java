
import java.util.*;
import java.io.*;

 class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String i1[]=br.readLine().split(" ");
		int n=Integer.parseInt(i1[0]);
		int k=Integer.parseInt(i1[1]);
		
		int a[]=new int[n+1];
		
		String line = br.readLine();
		while ( line != null  &&  !line.equals("")) {
		    
	    	int d=Integer.parseInt(line);
			String s=br.readLine();
			a[d]++;
			line=br.readLine();
		}
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
