import java.util.*;
public class ans
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fn=1;
		if(n<2)
		{
			fn=1;
		}
		if(n>=2)
		{
			for(int i=n;i>=1;i=i-2)
			{
				fn=fn*i;
			}
		}
		int count=0;
		while(fn!=0)
		{
			int d=fn%10;
			if(d==0)
			{
				count++;
			}
			if(d!=0)
			{
				break;
			}
			fn=fn/10;
		}
		System.out.println(count);
			
	}
}