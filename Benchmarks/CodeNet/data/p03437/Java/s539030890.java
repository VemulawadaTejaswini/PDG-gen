import java.util.*;
/*being john malkovich*/
class Main
{
	public static void main(String[] args)
	{
		long max = (long)(Math.pow(10,18));
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if(x%y == 0 || y%x == 0)
			System.out.println("-1");
		else
		{
			int flag = 0;
			for(long i =1;i*x < max;i++)
			{
				if((i*x)%y!=0)
				{
					flag = 1;
					System.out.println(i*x);		
					break;
				}
			}
			if(flag == 0)
				System.out.println("-1");
		}
	}

}