import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] m = new int[10];
		int[] h = new int[3];
		
		
		for(int i=0; i<3; i++)
		{
			h[i] = -1;
		}
		
		for(int i=0; i<10; i++)
		{
			m[i] = scanner.nextInt();
			if(h[0] < m[i])
			{		
				h[0] = m[i];
				int r = 0;
				for(int j=1; j<3; j++)
				{
					if(h[j] < h[r])
					{
						int buf = h[r];
						h[r] = h[j];
						h[j] = buf;
						r = j;
					}
				}
			}
		}
		
		for(int i=2; i>=0; i--)
		{
			System.out.println(h[i]+"");
		}
	}
}