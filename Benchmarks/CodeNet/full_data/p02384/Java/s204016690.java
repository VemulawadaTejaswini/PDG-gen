import java.util.Random;
import java.util.Scanner;

public class Main 
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int[] n = new int[6];
		for(int i=0; i<6; i++)
		{
			n[i] = scanner.nextInt();
		}
		
		int q = scanner.nextInt();
		
		for(int i=0; i<q; i++)
		{
			int[] in = new int[2];
			in[0] = scanner.nextInt();
			in[1] = scanner.nextInt();
			
			for(;;)
			{
				Random random = new Random();
				int d = random.nextInt(4);
				
				int[] buf = new int[6];
				for(int j=0; j<6; j++)
				{
					buf[j] = n[j];
				}
					
				switch(d)
				{
					case 0:
						n[0] = buf[4];
						n[1] = buf[0];
						n[5] = buf[1];
						n[4] = buf[5];
						break;
					case 1:
						n[0] = buf[1];
						n[1] = buf[5];
						n[5] = buf[4];
						n[4] = buf[0];
						break;
					case 2:
						n[0] = buf[2];
						n[2] = buf[5];
						n[5] = buf[3];
						n[3] = buf[0];
						break;
					case 3:
						n[0] = buf[3];
						n[3] = buf[5];
						n[5] = buf[2];
						n[2] = buf[0];
						break;
				}
				if(in[0]==n[0] && in[1]==n[1])
				{
					System.out.println(n[2]);
					break;
				}
			}
		}
	}
}