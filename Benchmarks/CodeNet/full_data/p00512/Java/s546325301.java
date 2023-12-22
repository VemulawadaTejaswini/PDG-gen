import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
			TreeMap<String, Integer> m2 = new TreeMap<String, Integer>();
			TreeMap<String, Integer> m3 = new TreeMap<String, Integer>();
			TreeMap<String, Integer> m4 = new TreeMap<String, Integer>();
			TreeMap<String, Integer> m5 = new TreeMap<String, Integer>();

			for(int i=0;i<n;i++)
			{
				String s=in.next();
				int cnt=in.nextInt();

				if(s.length()==1)
				{
					if(m1.containsKey(s))
					{
						cnt+= m1.get(s);
						
					}
					m1.put(s,cnt);
				}
				else if(s.length()==2)
				{
					if(m2.containsKey(s))
					{
						cnt+=m2.get(s);
						
					}
					m2.put(s,cnt);
				}
				else if(s.length()==3)
				{
					if(m3.containsKey(s))
					{
						cnt+=m3.get(s);
						
					}
					m3.put(s,cnt);
				}
				else if(s.length()==4)
				{
					if(m4.containsKey(s))
					{
						cnt+=m4.get(s);
						
					}
					m4.put(s,cnt);
				}
				else if(s.length()==5)
				{
					if(m5.containsKey(s))
					{
						cnt+=m5.get(s);
						
					}
					m5.put(s,cnt);
				}
			}
			
			 for (Map.Entry<String, Integer>   entry : m1.entrySet()) {
		            System.out.println(entry.getKey()+" "+entry.getValue());
		        }
		    for (Map.Entry<String, Integer>   entry : m2.entrySet()) {
		            System.out.println(entry.getKey()+" "+entry.getValue());
		        }
		    for (Map.Entry<String, Integer>   entry : m3.entrySet()) {
		            System.out.println(entry.getKey()+" "+entry.getValue());
		        }
		    for (Map.Entry<String, Integer>   entry : m4.entrySet()) {
		            System.out.println(entry.getKey()+" "+entry.getValue());
		        }
		    for (Map.Entry<String, Integer>   entry : m5.entrySet()) {
		            System.out.println(entry.getKey()+" "+entry.getValue());
		        }
			
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}