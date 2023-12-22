import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		StringBuilder str=new StringBuilder() ;
		int i=1;
		String temp=in.next();
		while(Integer.parseInt(temp)!=0)
		{
			str.append("Case " + i + ": " + Integer.parseInt(temp) + "\n");
			temp=in.next();
			i++;			
		}
		
		System.out.println(str);

	}
}