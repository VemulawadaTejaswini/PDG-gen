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
	static long sum =0 ,count =0 ;
	
	public static void dfs(int value)
	{
		abc:while(!lstk[value].isEmpty())
		{
			int poped = lstk[value].pop();
			// System.out.println("Stack value = "+value);
			// System.out.println("poped  value = "+poped);
			

			// if(visit[poped]==0)
			{
				sum+=hmap.get(value+" "+poped);
				// System.out.println("sum inside condition = "+sum);
				// System.out.println("visit value of poped element  = "+visit[poped]);
				// System.out.println("visit value of stack number = "+visit[value]);
				// count++;
				dfs(poped);
			}

			// System.out.println("poped = "+poped+" sum = "+sum +" Stack value = "+value );
			
			// System.out.println("currval = "+currval);
			// if(visit[value] == 0)
			if(hmap.containsKey(currval+" "+poped))
			{
				if(hmap.get(currval+" "+poped)!=sum)
				{
					chkflag = 1;
					break abc;
				}
			}
			else
			{
				hmap.put((currval+" "+poped),sum);
				hmap.put((poped+" "+currval),-sum);
			}

			// System.out.println("before sum =  "+sum);
			sum -=hmap.get(value+" "+poped) ;
			visit[poped]=1;
			// System.out.println("visit value of poped element  = "+visit[poped]);
			// System.out.println();
			// System.out.println();
		}		
		
		visit[value]=1;
		// sum =0 ;

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
			
			hmap.put(l+" "+r,d);
			hmap.put(r+" "+l,-d);

		}

		
		if(flag == 0)
		{
			while(!queries.isEmpty())
			{
				int ele = queries.remove();
				sum=0;
				currval = ele;
				newvisit = new int[noofnodes+1];
				
				// System.out.println("came from here "+ele);
				
				if(visit[ele] == 0)
				dfs(ele);			
				// visit[ele]=1;

				if(chkflag != 0)	
				{
					break;
					// System.out.println("time to take break ");
				}
			}
			// System.out.println(count);
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