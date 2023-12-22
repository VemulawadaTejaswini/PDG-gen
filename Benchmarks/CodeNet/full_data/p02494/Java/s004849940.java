import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			int w=sc.nextInt();
			int h=sc.nextInt();
			
			if(w==0 && h==0)break;
			
			for(int y=0; y<h; y++)
			{
				for(int x=0; x<w; x++)
				{
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}