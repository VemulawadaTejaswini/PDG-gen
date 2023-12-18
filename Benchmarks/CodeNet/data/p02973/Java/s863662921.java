								//package Dynamic;
import java.io.*;
import java.util.*;
class Main
{
    static public void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int t=Integer.parseInt(br.readLine());
//        while(t-->0)
//        {
        	int n=Integer.parseInt(br.readLine());
        	//int ar[]=new int[n];
//        	StringTokenizer st=new StringTokenizer(br.readLine());
        	//TreeSet<Integer> tt=new TreeSet<>();
        	int i=0;
//        	LinkedList<Integer> ar[]=new LinkedList[n];
//        	HashMap<Integer,Integer> h=new HashMap<>();
        	LinkedList<Integer> l=new LinkedList<>();
        	LinkedList<Integer> l2=new LinkedList<>();
        	while(i<n)
        	{
        		int a=Integer.parseInt(br.readLine());
        		l.add(a);
        		l2.add(a);
        		i++;
        	}
        	int c=0;
        	while(l.size()>0)
        	{
        		c++;
        		int a=-1;
        		for(int ll:l)
        		{
        			if(ll>a)
        			{
        				a=ll;
        				//System.out.println(a);
        				l2.remove((Integer)a);
        			}
        		}
        		l=new LinkedList<>(l2);
        		//System.out.println(l);
        	}
        	System.out.println(c);
        	
        		
    }
}