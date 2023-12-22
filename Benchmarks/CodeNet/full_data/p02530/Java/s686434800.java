import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int Taro = 0;
		int Hanako = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i)
		{
			String a = sc.next();
			String b = sc.next();
			if(a.compareTo(b) > 0)
			{
				Taro += 3;
			}
			else if(a.compareTo(b) < 0)
			{
				Hanako += 3;
			}
			else
			{
				Taro += 1;
				Hanako += 1;
			}
		}
		System.out.println(Taro + " " + Hanako);
	}
}