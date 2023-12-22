import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
        int n,i,j;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int m[]=new int[n];
        int k[]=new int[n];
        for(i=0;i<m.length;i++)
        {
        	m[i]=scan.nextInt();
        }
        
        for(i=0;i<m.length;i++)
        {
        	System.out.print(m[i]+" ");
        }
        for(j=0;j<m.length-1;j++)
        {
        	for(i=0;i<m.length-1;i++)
        	{
        		if(m[i]>m[i+1])
        		{
        			k[i]=m[i+1];
        			m[i+1]=m[i];
        			m[i]=k[i];
        		}
        	}
        	System.out.println("");
        	for(i=0;i<m.length;i++)
        	{
        		System.out.print(m[i]+" ");
        	}
        }
        
	}

}