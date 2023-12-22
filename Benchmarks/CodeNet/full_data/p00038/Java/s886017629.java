import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String st[]=in.next().split(",");
			int a[]=new int[st.length];
			int n=0;
			for(int i=0;i<5;i++)
				a[i]=Integer.valueOf(st[i]);
			for(int i=0;i<4;i++)
				for(int j=i+1;j<5;j++)
					if(a[i]==a[j])
						n++;
			Arrays.sort(a);
			switch(n)
			{
			case 1:
				System.out.println("one pair");
				break;
			case 2:
				System.out.println("two pair");
				break;
			case 3:
				System.out.println("three card");
				break;
			case 4:
				System.out.println("full house");
				break;
			case 6:
				System.out.println("four card");
				break;
			default:
				if(straight(a))
					System.out.println("straight");
				else
					System.out.println("null");
			}
		}
	}
	public static boolean straight(int a[])
	{
		if(a[0]+1==a[1]&&a[1]+1==a[2]&&a[2]+1==a[3]&&a[3]+1==a[4])
			return true;
		else if(a[0]==1&&a[1]==10&&a[2]==11&&a[3]==12&&a[4]==13)
			return true;
		else
			return false;
	}
}