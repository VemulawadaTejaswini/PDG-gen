import java.util.*;
 
class Main
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
			if(t[i]-start>=k)
			{
				bus++;
				people=0;
                                start=t[i];
			}
			people++;
			if(people==c)
			{
				bus++;
				people=0;
                                 if(i+1<n)
                                 start=t[i+1];
			}
			i++;
		}
		System.out.print(bus);
	}
}