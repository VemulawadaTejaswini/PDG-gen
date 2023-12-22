import java.util.*;
import java.io.*;

class Main
{
    static class Len
    {	
	int a[]; //= new int[2000010];
	int b[]; //= new int[2000010];
	
	Len(int n)
	{
	    a = new int[n+1];
	    b = new int[n+1];
	}
	

    }

    public static void main(String args[])
    {
	int n;
	int i, j, k;

	String line = new String();
	BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	//PrintStream out = new PrintStream(System.out);

	//Read ----------------
	//Read n
	try{
	    line=line=bin.readLine();
	}	
	catch(IOException e){
	    System.out.println("Error");
	}

	n=Integer.parseInt(line);
	Len len = new Len(n);
	j=0;
	//Read A[]
	try{
	    line=bin.readLine();
	    //System.out.println(line);
	    StringTokenizer str = new StringTokenizer(line);   
	    for(i=0; i<n; i++)
		{
		    len.a[i]=Integer.parseInt(str.nextToken());
		    if(j<len.a[i])j=len.a[i];
		}
	}
	catch(IOException e){
	    System.out.println("Error");
	}

	//bin=null;

	//Read end------------


	//sort
	countingSort(len, j, n);

	//print
	StringBuffer s = new StringBuffer(100);
	for(i=1; i<=n; i++)
	    {
		s.append(len.b[i]);
		if(i!=n)s.append(" ");
	    }
	System.out.println(s);
	//	out.print(len.b[i]+" ");
	//out.println(len.b[n]);

	/*
	for(i=1; i<n; i++)System.out.print(len.b[i]+" ");
	System.out.println(len.b[n]);*/

    }

    static void countingSort(Len len, int max, int n)
    {
	int i, j, k;
	int[] c = new int[max+1];

	//for(i=0; i<=max; i++)c[i]=0;
	for(i=0; i<n; i++)c[len.a[i]]++;

	for(i=0; i<=max; i++)
	    {
		if(i!=0)c[i]+=c[i-1];
	    }

	for(i=n-1; i>=0; i--)
	    {
		len.b[c[len.a[i]]]=len.a[i];
		c[len.a[i]]--;
	    }
    }
}