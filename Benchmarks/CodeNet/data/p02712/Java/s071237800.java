import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		ArrayList<Long> list=new ArrayList<>();
		
		long num=1;
		
		while(num!=n+1)
		{
			if(num%3!=0&&num%5!=0)
			{
				list.add(num);
				num++;
			}
			else
			{
				num++;
			}
		}
		
		long sum=0;
		
		for(int i=0;i<list.size();i++)
		{
			sum=sum+list.get(i);
		}
		
		System.out.println(sum);
		
	}
	
}
