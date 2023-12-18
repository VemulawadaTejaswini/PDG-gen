import java.util.*;

class agco11A
{
	public static void main(String args[])
	{
		int n,c,k;
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		c=sc.nextInt();
		k=sc.nextInt();
		
		int[] t=new int[n];
		for(int i=0;i<n;i++)
			t[i]=sc.nextInt();
		
		Arrays.sort(t);
		
		int i=0,start,bus=1,people=0;
		start=t[0];
		while(i<n)
		{
			if(t[i]-start>k)
			{
				bus++;
				people=0;
			}
			people++;
			if(people==1)
				start=t[i];
			if(people==c)
			{
				bus++;
				people=0;
			}
			i++;
		}
		System.out.print(bus);
	}
}