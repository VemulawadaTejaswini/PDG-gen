import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Map<Integer,ArrayList> infoMap = new HashMap<Integer,ArrayList>();
		Tuple ts = null;
		Tuple td = null;
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
			td = new Tuple(b,a,-c);
			infoMap.get(a).add(ts);
			infoMap.get(b).add(td);
		}
		
		
		Set<Integer> visited = new HashSet<Integer>();
		Deque<Integer> frontier = new LinkedList<Integer>();
		long distance[] = new long[n];
		if(ts!=null)
			frontier.addFirst(ts.source);
		
		while(!frontier.isEmpty())
		{	
			int toVisit = frontier.removeFirst();
			//System.out.print(toVisit+",");
			
				for(int i=0; i<infoMap.get(toVisit).size();i++)
				{	
					Tuple tmp = (Tuple)(infoMap.get(toVisit).get(i));
					if(!visited.contains(toVisit)){
						frontier.addFirst(tmp.dest);
						if(distance[tmp.dest-1]==0)
						{
							distance[tmp.dest-1]=tmp.cost+distance[tmp.source-1];
						}
						else if(distance[tmp.dest-1]!=tmp.cost+distance[tmp.source-1])
						{
							System.out.println("No");
							System.exit(1);
						}
						visited.add(toVisit);
					}
						
				}
			
			
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