import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0;i<m;i++)
		{
			int temp = sc.nextInt();
			n -=temp;
		}
		if(n<0)
		{
			System.out.println(-1);
		}
		else
			System.out.println(n);
	}
}