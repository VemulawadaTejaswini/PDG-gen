import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i=n;i<=999;i++)
		{
			if(check(i))
			{
				System.out.println(i);
				break;
			}

		}
	}

	static boolean check(int n)
	{
		int x=n%10;
		n/=10;
		if(n%10!=x)
			return false;
		n/=10;
		if(n%10!=x)
			return false;
		return true;
	}
}