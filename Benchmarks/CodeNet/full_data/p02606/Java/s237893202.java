
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays; 

class Codechef
{
	public static void main (String[] args) throws Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String str[]=br.readLine().trim().split(" ");
	    int l=Integer.parseInt(str[0]);
	    int r=Integer.parseInt(str[1]);
	    int d=Integer.parseInt(str[2]);
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%d==0)
             count++;
        }
	    
	    System.out.println(count);
	     
	    }
	    
	}
	
	
	


