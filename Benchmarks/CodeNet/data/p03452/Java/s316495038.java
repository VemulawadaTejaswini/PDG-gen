import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//int start = sc.nextInt();
		Map<Integer,ArrayList> infoMap = new HashMap();
		Tuple ts = null;
		for(int i=0;i<m;i++)
		{
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(!infoMap.containsKey(a))
				infoMap.put(a,new ArrayList<Tuple>());
			if(!infoMap.containsKey(b))
				infoMap.put(b,new ArrayList<Tuple>());
			ts = new Tuple(a,b,c);
			//Tuple td = new Tuple(b,a,c);
			infoMap.get(a).add(ts);
			//infoMap.get(b).add(td);
			
		}
		
		
		Set<Integer> visited = new HashSet<Integer>();
		Deque<Integer> frontier = new LinkedList<Integer>();
		int distance[] = new int[n];
		if(ts!=null)
			frontier.addLast(ts.source);
		
		while(!frontier.isEmpty())
		{	
			int toVisit = frontier.removeFirst();
			if(visited.contains(toVisit))
			{
				System.out.println("No");
				System.exit(1);
			}
			for(int i=0; i<infoMap.get(toVisit).size();i++)
			{	
				Tuple tmp = (Tuple)infoMap.get(toVisit).get(i);
				frontier.addLast(tmp.dest);
				if(distance[tmp.dest-1]==0)
					distance[tmp.dest-1]=tmp.cost;
				else if(distance[tmp.dest-1]!=(tmp.cost+distance[tmp.source-1]))
				{
					System.out.println("No");
					System.exit(1);
				}
				
			}
			visited.add(toVisit);
			
		}
		
		System.out.println("Yes");
	}
	
}
class Tuple
{
	public int source;
	public int dest;
	public int cost;
	public Tuple(int s,int d,int c)
	{
		source = s;
		dest = d;
		cost = c;
	}
	public String tString()
	{
		return "("+source+","+dest+","+cost+")";
	}
}