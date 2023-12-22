import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		int num;
		int i=1;
		
		while(true)
		{
				num=scan.nextInt();;		
			if(num!=0)
			{
				System.out.println("Case"+" "+i+":"+" "+num);
				i++;
			}
			else
			{
				break;
			}
		}
	}

}