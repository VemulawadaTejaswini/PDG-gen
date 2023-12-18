import java.util.ArrayList;
import java.util.*;
 class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		int i,j;
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap();
		HashMap<Integer,Integer> v=new HashMap();
		for(i=1;i<=n;i++)
		{
			h.put(i, sc.nextInt());
			v.put(i,1);
		}
		
		int in,og;
		for(i=0;i<m;i++)
		{
			in=sc.nextInt();
			og=sc.nextInt();
			if(h.get(in)==h.get(og))
			{
				v.put(in, -1);
				v.put(og, -1);
			}
		 if(h.get(in)>h.get(og))
			{
				v.put(og, -1);
			}
			if(h.get(in)<h.get(og))
			{
				v.put(in,-1);
			}
		}
		int count=0;
		for(i=1;i<=n;i++)
		{
			if(v.get(i)!=-1)
				count++;
		}
		
		
			
		System.out.println(count);
		
			
	}
}