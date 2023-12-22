import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = 0;
		int flg = 0;
		for(int i = 1;i <= num;i++)
		{
			x = i;
			if(x % 3 == 0)
			{
				System.out.print(" " + i);
			}else{
				flg = 0;
				while(x > 0 && flg == 0)
				{
					if(x % 10 == 3)
					{
						System.out.print(" " + i);
						flg = 1;
					}
					x /= 10;
				}
			}
			
		}
		System.out.println("");
	}
}