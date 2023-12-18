import java.util.*;
public class main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(); //all number
		int []numberBox=new int[number];
		for(int i=0;i<number;i++)
		{
			numberBox[i]=sc.nextInt();
		}

		checkEven(numberBox,number); //check number all even
		
	}
	public static void checkEven(int[] box,int num)
	{
		int count=0; //count number all even
		int countTimes=0; //count number divided times
		while(true)
		{
			for(int i=0;i<num;i++)
			{
				if(box[i]%2==0)
					count++;
			}
			if(count==num)
			{
				for(int j=0;j<num;j++)
				{
					box[j]/=2;
				}
				countTimes++;
			}
			else
			{
				System.out.println(countTimes);
				break;
			}
		}	
	}
}
