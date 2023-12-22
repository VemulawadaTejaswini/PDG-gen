import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

   
    @SuppressWarnings("unchecked")
      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	while(true)
	    {
		int n;
		n = Integer.parseInt(in.readLine());
		if(n == 0)
		    break;

		List<Integer>[] list = new ArrayList[n+3];
		for(int i=0;i<=n;i++)
		    list[i] = new ArrayList<Integer>();

		for(int i=0;i<n;i++)
		    {
			String[] line = in.readLine().split(" ");
			int t = Integer.parseInt(line[0]);
			for(int j=1;j<=t;j++)
			    {
				list[i].add(Integer.parseInt(line[j]));
			    }

		    }

		String[] elements = in.readLine().split(" ");
		int K = Integer.parseInt(elements[0]);
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int i=1;i<=K;i++)
		    {
			l.add(Integer.parseInt(elements[i]));
		    }
	

		int cnt = 0,pos = -1;
		for(int i=0;i<n;i++)
		    {
			HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
			for(int j=0;j<l.size();j++)
			    map.put(l.get(j),true);

			int cnt2 = 0;
			for(int j=0;j<list[i].size();j++)
			    {
				if(map.containsKey(list[i].get(j)) && map.get(list[i].get(j)))
				    cnt2++;
			    }
			if(cnt2 == K)
			    {
			
				cnt++;
				pos = i;
			    }

		    }



		if(cnt == 1)
		    System.out.println((pos+1));
		else
		    System.out.println(-1);
	    }
    }

}