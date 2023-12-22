import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		
		Scanner scan= new Scanner(System.in);
		while(true)
		{
			int ans = 0;
			
			String number = scan.next();

			for(int i=0; i<number.length(); i++)
			{
				ans=ans + number.charAt(i)-'0';
			}
			if(ans==0)
				break;
			System.out.println(ans);
			
		}
	}
}