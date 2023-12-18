import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException
	  {
	    InputStreamReader ir=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(ir);
	    String [] vertex_query=br.readLine().split(" ");
	    int vertex=Integer.parseInt(vertex_query[0]);
	    int query=Integer.parseInt(vertex_query[1]);
	    HashMap<Integer,ArrayList<Integer>> relation=new HashMap<>();
	    HashMap<Integer,Integer> counter=new HashMap<>();
	    for(int i=1;i<=vertex;i++)
	    {
	    	relation.put(i, new ArrayList<>());
	    	counter.put(i,0);
	    }
	    for(int i=1;i<vertex;i++)
	    {
	    	String [] temp=br.readLine().split(" ");
	    	int node=Integer.parseInt(temp[0]);
	    	int child=Integer.parseInt(temp[1]);
	    	ArrayList<Integer> getOld=relation.get(node);
	    	getOld.add(child);
	    	relation.put(node,getOld);
	    }
	    for(int i=1;i<=vertex;i++)
	    {
	    	filling(i,relation);
	    }
	    /**
	    for(int i=1;i<=vertex;i++)
	    {
	    	ArrayList<Integer>  value= relation.get(i);
	    	System.out.print(i+"---->");
	    	for(int j=0;i<value.size();j++)
	    	{
	    		System.out.print(value.get(j)+",");
	    	}
	    	System.out.println();
	    }**/
	    for(int i=0;i<query;i++)
	    {
	    	String [] temp=br.readLine().split(" ");
	    	int node=Integer.parseInt(temp[0]);
	    	int counter_inc=Integer.parseInt(temp[1]);
	    	//System.out.println(node+"--->"+counter_inc);
	    	counter.put(node, counter.get(node)+counter_inc);
	    	ArrayList<Integer>  value= relation.get(node);
	    	for(int j=0;j<value.size();j++)
	    	{
	    		counter.put(value.get(j), counter.get(value.get(j))+counter_inc);
	    	}
	    }
	    StringBuffer out=new StringBuffer();
	    for(int i=1;i<=vertex;i++)
	    {
	    	out.append(counter.get(i));
	    	if(i!=vertex)
	    	{
	    		out.append(" ");
	    	}
	    }
	    System.out.println(out);
	    

}
	public static void filling(int number,HashMap<Integer,ArrayList<Integer>> relation)
	{
		ArrayList <Integer>  value=relation.get(number);
		Queue <Integer> bfs=new LinkedList<>();
		ArrayList <Integer>  ans=new ArrayList<>();
		for(int i=0;i<value.size();i++)
		{
		bfs.add(value.get(i));
		}
		while(!bfs.isEmpty())
		{
			int num=bfs.remove();
			ans.add(num);
			ArrayList <Integer>  temp=relation.get(num);
			for(int i=0;i<temp.size();i++)
			{
			bfs.add(temp.get(i));
			}
			
		}
		relation.put(number, ans);
	}
}