import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Integer> mp=new TreeMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String p=sc.next();
			if(mp.containsKey(p))
			{
				mp.put(p,mp.get(p)+1);
			}
			else
			{
				mp.put(p,1);
			}
		}
	   Set<Map.Entry<String,Integer>> sp=mp.entrySet();
	   long flag1=0;
	   long flag2=0;
	   long flag3=0;
	   long flag4=0;
	   if(mp.get("AC")==null)
	   {
		   System.out.println("AC X "+"0");  
	   }
	   else
	   {
	   System.out.println("AC X "+mp.get("AC"));
	   }
	   if(mp.get("WA")==null)
	   {
		   System.out.println("WA X "+"0"); 
	   }
	   else
	   {
	   System.out.println("WA X "+mp.get("WA"));
	   }
	   if(mp.get("TLE")==null)
	   {
		   System.out.println("TLE X "+"0"); 
	   }
	   else
	   {
	   System.out.println("TLE X "+mp.get("TLE"));
	   }
	   if(mp.get("RE")==null)
	   {
		   System.out.println("RE X "+"0"); 
	   }
	   else
	   {
	   System.out.println("RE X "+mp.get("RE"));
	   }