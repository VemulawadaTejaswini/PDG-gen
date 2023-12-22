import java.util.ArrayList;
import java.util.Scanner;
 class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		int i,j;
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> a=new ArrayList();
		for(i=1;i<=n;i++)
			a.add(i);
		int in,og;
		for(i=0;i<m;i++)
		{
			in=sc.nextInt();
			og=sc.nextInt();
			if(in==og)
			{
				a.remove(in-1);
				a.add(in-1,-1);
				a.remove(og-1);
				a.add(og-1,-1);
			}
			else if(in>og)
			{
				a.remove(og-1);
				a.add(og-1,-1);
			}
			else
			{
				a.remove(in-1);
				a.add(in-1,-1);
			}
		}
		int count=0;
		for(i=0;i<n;i++)
		{
			if(a.get(i)!=-1)
				count++;
		}
		
		
			
		System.out.println(count);
		
			
	}
}