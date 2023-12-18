import java.util.*;
class Main
{
	static int noofnodes , noofqueries;
	static int[] arr = new int[100100];
	static Stack<Integer>[] lstk,rstk ;
	// static Stack<Integer> queries ;  
	static HashMap<String,Long> hmap = new HashMap<>();
	static int[] visit ,newvisit;
	static int flag =0 , currval=0 , chkflag =0 ;
	static Queue<Integer> queries = new LinkedList<>();
	static long sum =0 ;
	
	public static void dfs(int value)
	{
		// visit[value] = 1;
		// System.out.println("element passed ="+value);
		Iterator<Integer> itr = lstk[value].iterator();
		if(itr.hasNext())
		{
			int ele = itr.next();
			// int ele = itr.pop();
			// System.out.println("element ele = "+ele);
			
			if(newvisit[ele] == 0)
			{
				sum+=hmap.get(value+" "+ele);
				// System.out.println("sum = "+sum);

				if(hmap.containsKey(currval+" "+ele))
				{
					if(hmap.get(currval+" "+ele)!= sum)
					{
						chkflag = 1;
						return ;
					}
				}
				else
				{
					hmap.put(currval+" "+ele , sum);
					hmap.put(ele+" "+currval , -sum);
				}
					newvisit[ele] = 1;
					dfs(ele);				
					sum = 0;
			}
		}


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

			String line1 = l+" "+r;
			String line2 = r+" "+l;
			if(hmap.containsKey(line1))
			{
				Long p = hmap.get(line1);
				long chk = ((long)p);
				if(chk!=d)
					flag = 1;
			}
			
			if(hmap.containsKey(line2))
			{
				Long p = (long)hmap.get(line2);
				long chk = ((long)p);
				if(chk!=d)
					flag = 1;
			}
			
			if(!hmap.containsKey(line1))
			{
				hmap.put(line1,d);
			}
			
			if(!hmap.containsKey(line2))
			{
				hmap.put(line2,-d);
			}

			// hmap.put(l+" "+r,d);
			// hmap.put(r+" "+l,-d);

		}

		
		if(flag == 0)
		{
			while(!queries.isEmpty())
			{
				int ele = queries.remove();
				sum=0;
				currval = ele;
				newvisit = new int[noofnodes+1];
				visit[ele]=1;
				// System.out.println("came from here "+ele);
				dfs(ele);			
				if(chkflag != 0)	
				{
					break;
					// System.out.println("time to take break ");
				}
			}
			if(chkflag == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		else
		{
			System.out.println("No");
		}

			

	}


}