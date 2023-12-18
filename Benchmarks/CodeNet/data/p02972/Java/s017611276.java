						//		package Dynamic;
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
        	int ar[]=new int[n];
        	StringTokenizer st=new StringTokenizer(br.readLine());
        	//TreeSet<Integer> tt=new TreeSet<>();
        	int i=0;
        	HashSet<Integer> h=new HashSet<>();
        	while(i<n)
        	{
        		ar[i]=Integer.parseInt(st.nextToken());
        		if(ar[i]==1)
        			h.add(i+1);
        		i++;
        	}
        	if(h.size()>1)
        	{
        		System.out.println("-1");
        		System.exit(0);
        	}
        	HashSet<Integer> hh=new HashSet<>();
        	int ff=0;
        	o:
        	for(int x=1;x<=n;x++)
        	{
        		if(ar[x-1]==1)
        		{
        			int c=0;
        			
        			for(int y=x;y<=n;y+=x)
        			{
        				if(h.contains(y))
        				{
        					c++;
        					hh.add(y);
        				}
        				if(c==2)
        				{
        					ff++;break o;
        				}
        			}
        		}
        		else
        		{
        			
        			for(int y=x;y<=n;y+=x)
        			{
        				if(h.contains(y))
        				{
        					ff++;
        					break o;
        				}
        			}
        		}
        	}
        	if(ff!=0)
        		System.out.println("-1");
        	else
        	{
        		System.out.println(hh.size());
        		for(int xx:hh)
        			System.out.print(xx+" ");
        	}
        		
    }
}