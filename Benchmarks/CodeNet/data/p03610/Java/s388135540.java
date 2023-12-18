import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer(sc.nextLine());
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				str.delete(i,i+1);
			}	
		}
		System.out.println(str);
	}
}