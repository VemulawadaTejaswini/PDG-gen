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
		
		String str = scanner.next();
		for(int i=0; i<str.length(); i++)
		{
			String s = str.substring(i, i+1);
			
			int[] buf = new int[6];
			for(int j=0; j<6; j++)
			{
				buf[j] = n[j];
			}
			
			switch(s)
			{
				case "S":
					n[0] = buf[4];
					n[1] = buf[0];
					n[5] = buf[1];
					n[4] = buf[5];
					break;
				case "N":
					n[0] = buf[1];
					n[1] = buf[5];
					n[5] = buf[4];
					n[4] = buf[0];
					break;
				case "W":
					n[0] = buf[2];
					n[2] = buf[5];
					n[5] = buf[3];
					n[3] = buf[0];
					break;
				case "E":
					n[0] = buf[3];
					n[3] = buf[5];
					n[5] = buf[2];
					n[2] = buf[0];
					break;
			}
		}
		System.out.print(n[0]);
	}
}