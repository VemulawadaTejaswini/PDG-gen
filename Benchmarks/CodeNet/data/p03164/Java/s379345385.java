import java.io.*;
import java.lang.*;
import java.util.*;

class Node{
        int weight;
        long value;
        Node(int w , long v)
        {
            this.weight =w;
            this.value =v;
        }
        
    }

public class Main {
    
    
    
	public static void main (String[] args) throws IOException
	{
	   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));
	   String line1= br.readLine();
	   String strs1[]= line1.trim().split("\\s+");
	   int n= Integer.parseInt( strs1[0] );
	   int total= Integer.parseInt(strs1[1]);
	   
	   long arr[][]= new long[n+1][total+1];
	   
	   for(int i=0 ; i<total+1 ;i++)
	   {
	       arr[0][i]=0;
	   }
	   
	   for(int i=0;i<=n; i++)
	    arr[i][0]=0;
	    
	   Node data[]= new Node[n];
	   
	   for(int i=0;i<n ; i++)
	   {
	        String line=br.readLine();
	        String strs[]=line.trim().split("\\s+");
	        int w= Integer.parseInt(strs[0] );
	        long v= Long.parseLong(strs[1] );
	        Node temp=new Node(w , v);
	        data[i]=temp;
	   }
	   Arrays.sort(data , new The_comparator() );
	   
	   for(int i=1 ; i<=n ; i++)
	   {
	       int w1=data[i-1].weight;
	       long v1=data[i-1].value;
	       for(int j=1 ; j<=total ; j++)
	       {
	           if(j<w1)
	              arr[i][j]=arr[i-1][j];
	           else
	                arr[i][j]= Math.max( arr[i-1][j] , arr[i-1][j-w1] + v1);
	       }
	   }
	   
	   System.out.println(arr[n][total]);
		//code
	}
}

class The_comparator implements Comparator<Node>
{
    public int compare(Node n1 , Node  n2)
    {
        return(n1.weight-n2.weight);
    }
}