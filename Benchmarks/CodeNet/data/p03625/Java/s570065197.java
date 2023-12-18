import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long[] box=new long[num];
		
		for(int i=0;i<num;i++)
		{
			box[i]=sc.nextLong();
		}
		Arrays.sort(box);
		
		long[] Nbox=new long[num+1];
		for(int i=0;i<num;i++)
		{
			Nbox[i]=box[i];
		}
		long count=box[0];
		int time=1;
		
		for(int i=0;i<num;i++)
		{
			if(count!=box[i])
			{
				time++;
				count=box[i];
			}
		}
		
		long[][] NT=new long[time][2];
		count=Nbox[0];
		int boxtime=0,
			j=0;
		
		for(int i=0;i<num+1;i++)
		{
			if(count==Nbox[i])
			{
				boxtime++;
			}
			else if(count!=Nbox[i]||i==num-1)
			{
				NT[j][0]=Nbox[i-1];
				NT[j][1]=boxtime;
				j++;
				count=Nbox[i];
				boxtime=1;
			}
		}
		
		int countnumTime=0;
		long ans=1;
		
		for(int i=time-1;i>=0;i--)
		{
			if(NT[i][1]>=2&&NT[i][1]<4)
			{
				ans*=NT[i][0];
				countnumTime++;
			}
			if(NT[i][1]>=4&&ans==1)
			{
				ans*=NT[i][0]*NT[i][0];
				System.out.println(ans);
				break;
			}
			if(countnumTime==2)
			{
				System.out.println(ans);
				break;
			}
			if(i==0)
			{
				System.out.println("0");
				break;
			}
		}
	}
}