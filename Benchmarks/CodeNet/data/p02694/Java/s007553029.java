import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int l = 100;
		while(true)
		{
			l = (int)(l * 1.01);
			m++;
			if(l >= n)
			{
				break;
			}
		}
		
		System.out.println(m);
	}
}