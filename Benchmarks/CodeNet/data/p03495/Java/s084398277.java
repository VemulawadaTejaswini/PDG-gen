import java.util.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int allnum=sc.nextInt(),
			repeatnum=sc.nextInt();
		int[] ballBox=new int[allnum];
		
		for(int i=0;i<allnum;i++)
		{
			ballBox[i]=sc.nextInt();
		}
		
		Arrays.sort(ballBox);
		
		int[] bignum=new int[ballBox[allnum-1]];
		
		for(int i=0;i<allnum;i++)
		{
			for(int j=0;j<ballBox[allnum-1];j++)
			{
				if(j+1==ballBox[i])
				{
					bignum[j]++;
				}
			}		
		}
		
		int count=0,
			k=0,
			num=0;
		
		while(true)
		{
			if(count==repeatnum)
			{
				System.out.println(allnum-num);
				break;
			}
			if(k==ballBox[allnum-1]&&count<repeatnum)
			{
				System.out.println(0);
				break;
			}
			if(bignum[k]!=0)
			{
				num+=bignum[k];
				count++;
			}
			k++;
		}
	}
}
