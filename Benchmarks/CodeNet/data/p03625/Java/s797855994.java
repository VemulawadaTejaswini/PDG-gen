import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] box=new int[num];
		for(int i=0;i<num;i++)
		{
			box[i]=sc.nextInt();
		}
		Arrays.sort(box);
		int[] numBox=new int[box[num-1]+1];
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<box[num-1]+1;j++)
			{
				if(box[i]==j)
				{
					numBox[j]++;
				}
			}
		}
		int count=0,
			all=1;
		for(int i=box[num-1];i>0;i--)
		{
			if(numBox[i]>=2)
			{
				all*=i;
				count++;
			}
			if(count==2)
			{
				System.out.println(all);
				break;
			}
			if(i==1)
			{
				System.out.println("0");
				break;
			}				
		}
	}
}