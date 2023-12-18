import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long m=2019;
		
		String str=s.next();
		
		int n=str.length();
		
		long ans=0;
		
		HashMap<Long,Long> map=new HashMap<>();
		
		map.put(0l,1l);
		
		long pow=1;
		long v=0;
		
		for(int i=n-1;i>=0;i--)
		{
			if(str.charAt(i)!='0')
			{
				long digit=Long.valueOf(str.charAt(i)+"");
				
				long mod=(v%m+(digit%m*pow%m)%m)%m;
				pow=(pow%m*10)%m;
				v=mod;
				
				if(map.containsKey(mod))
				{
					ans=ans+map.get(mod);
					map.put(mod,map.get(mod)+1);
				}
				else
				{
					map.put(mod,1l);
				}
			}
			else
			{
				pow=(pow%m*10)%m;
			}
		}
		
		System.out.println(ans);
		
	}
	
	
	
}