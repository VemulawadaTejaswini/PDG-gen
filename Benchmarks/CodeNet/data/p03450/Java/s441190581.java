import java.util.*;
class Main
{
	static int noofnodes , noofqueries;
	static int[] arr = new int[100100];
	static Stack<Integer>[] lstk,rstk ;
	// static Stack<Integer> queries ;  
	static HashMap<String,Long> hmap = new HashMap<>();
	static int[] visit ;
	static int flag =0 ;
	static Queue<Integer> queries = new LinkedList<>();
	public static void dfs()
	{
		// Collection.sort(queries);
		// abc:for(int ele = 0;ele<=noofnodes;ele++)
		abc:while(!queries.isEmpty())
		{
			int ele = queries.remove();
			// System.out.println("eleemnt poped by queries(ele) "+ele);
			if(visit[ele]==0)
			{
				visit[ele]=1;
				while(!lstk[ele].isEmpty())
				{
					int newele = lstk[ele].pop();
					// System.out.println("element pop by lstk(newele) "+newele);
					
					long sum = hmap.get(ele+" "+newele);
					// System.out.println("sum of ele + newele "+sum);


					if(visit[newele]==0)
					{
						// visit[newele] = 1;
						while(!lstk[newele].isEmpty())
						{
							int extra = lstk[newele].pop();
							sum+= hmap.get(newele+" "+extra);
							// System.out.println("extra ele poped  = "+extra);
							// System.out.println("sum of newele and extra = "+hmap.get(newele+" "+extra));
							// System.out.println("and actual sum = "+sum);
							if(hmap.containsKey(ele+" "+extra) )
							{
								// System.out.println("ele and extra sum = "+hmap.get(ele+" "+extra));
								if((hmap.get(ele+" "+extra))!= sum )
								{
									flag =1;
									break abc;
								}
							}
							else
							{
								hmap.put(ele+" "+extra , sum);
								hmap.put(extra+" "+ele,-sum);
							}
						}
						
					}

				}
			}
		}

		// System.out.println("flag = "+flag);
		if(flag == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}


	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		noofnodes = s.nextInt();
		noofqueries = s.nextInt();
		visit = new int[noofnodes+1];

		lstk = new Stack[noofnodes+1];
		rstk = new Stack[noofnodes+1];
		// queries = new Stack<Integer>();
		for(int i =0;i<noofnodes+1;i++ )
		{
			lstk[i] = new Stack<Integer>();
			rstk[i] = new Stack<Integer>();
		}

		//storing 
		for(int i=0;i<noofqueries;i++)
		{
			int l = s.nextInt();
			int r = s.nextInt();
			long d = s.nextLong();
			lstk[l].push(r);
			rstk[r].push(l);
			if(arr[l] == 0)
				queries.add(l);
			arr[l] = 1;
			hmap.put(l+" "+r,d);
			hmap.put(r+" "+l,-d);

		}

		

		dfs();

			

	}


}