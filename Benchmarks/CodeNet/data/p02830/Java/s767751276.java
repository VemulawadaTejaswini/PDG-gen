import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i));
			System.out.print(t.charAt(i));
		}
		System.out.println();
		sc.close();
	}
}
