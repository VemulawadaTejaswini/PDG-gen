import java.util.*;
class Main
{
	static Scanner s = new Scanner(System.in);
	static int nodes , edges ,currnode , flag ;
	static int[] visit ,newvisit;
	static LinkedList<Integer> list[];
	static HashMap<String,Long> hmap = new HashMap<>();
	static long sum =0 ;
	static Queue<Integer> queries = new LinkedList<>();
	static int[] arr = new int[100100];

	public static void dfs(int value)
	{
		newvisit[value] = 1;
		
		Iterator<Integer> itr = list[value].iterator();


		abc:while(itr.hasNext())
		{
			int ele = itr.next();

			if(newvisit[ele]==0)
			{
				// System.out.println(value+" "+ele);
				 sum+=hmap.get(value+" "+ele);

				 // System.out.println("sum of "+value+" and "+ele+" = "+sum);
				
				if(hmap.containsKey(currnode+" "+ele))
				{
					// System.out.println("value of "+currnode+" and "+ele+" = "+hmap.get(currnode+" "+ele));
					if(hmap.get(currnode+" "+ele)!=sum)
					{
						flag = 1;
						break abc;
					}
				}
				else
				{
					hmap.put((currnode+" "+ele),sum);
					hmap.put((ele+" "+currnode),-sum);
				}
				

				dfs(ele);
				sum-=hmap.get(value+" "+ele);
			}
		}





	}


	public static void main(String[] args)
	{
		nodes = s.nextInt();
		edges = s.nextInt();
		newvisit = new int[nodes+1];
		list = new LinkedList[nodes+1];
		for(int i =0 ;i<nodes+1;i++)
			list[i] = new LinkedList();

		for(int i =0 ;i<edges;i++)
		{
			int l = s.nextInt();
			int r = s.nextInt();
			long d = s.nextLong();

			list[l].add(r);
			if(arr[l] == 0)
				queries.add(l);
			arr[l] = 1;

			hmap.put( (l+" "+r), d);
			hmap.put((r+" "+l),-d );
		}

		while(!queries.isEmpty())
		{
			int i = queries.remove();
			visit = new int[nodes+1];
			currnode = i;
			sum =0 ;
			newvisit[i]=1;
			dfs(i);			
			if(flag == 1)
				break;
		}

		if(flag == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}