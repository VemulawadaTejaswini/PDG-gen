import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		Map<String,Long> mp=new HashMap<String,Long>();
		for(int i=0;i<n;i++)
		{
			String p=sc.next();
			if(mp.containsKey(p))
			{
				mp.put(p,mp.get(p)+1);
			}
			else
			{
				mp.put(p,1l);
			}
		}
	   Set<Map.Entry<String,Long>> sp=mp.entrySet();
	   long flag1=0;
	   long flag2=0;
	   long flag3=0;
	   long flag4=0;
	   for(Map.Entry<String,Long> st:sp)
	   {
		     if(st.getKey().equals("AC"))
		     {
		    	 flag1=1;
		    	 System.out.println("AC x "+st.getValue());
		    	 continue;
		     }
		     if(st.getKey().equals("WA"))
		     {
		    	 flag2=1;
		    	 System.out.println("WA x "+st.getValue());
		    	 continue;
		     }
		     if(st.getKey().equals("TLE"))
		     {
		    	 flag3=1;
		    	 System.out.println("TLE x "+st.getValue());
		    	 continue;
		    	 
		     }
		     if(st.getKey().equals("RE"))
		     {
		    	 flag4=1;
		    	 System.out.println("RE x "+st.getValue());
		    	 continue;
		     }
	   }
	   if(flag1==0)
	   {
		   System.out.println("AC x "+"0"); 
	   }
	   if(flag2==0)
	   {
		   System.out.println("WA x "+"0"); 
	   }
	   if(flag3==0)
	   {
		   System.out.println("TLE x "+"0"); 
	   }
	   if(flag4==0)
	   {
		   System.out.println("RE x "+"0"); 
	   }
		
	}

}
