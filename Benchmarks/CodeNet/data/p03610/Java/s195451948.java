import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(),
			   ansStr="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				ansStr+=str.charAt(i);
			}	
		}
		System.out.println(ansStr);
	}
}