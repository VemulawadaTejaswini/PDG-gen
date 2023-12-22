import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		StringBuilder str=new StringBuilder() ;
		int i=0;
		String temp=in.nextLine();
		while(Integer.parseInt(temp)!=0)
		{
			str.append("Case " + i+1 + ": " + Integer.parseInt(temp) + "\n");
			temp=in.nextLine();
			i++;			
		}
		
		System.out.println(str);

	}
}