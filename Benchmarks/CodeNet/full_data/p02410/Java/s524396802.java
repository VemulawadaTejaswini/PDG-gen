import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		
		int[][] a = new int[h][w];
		int[] b = new int[w];
		
		int c[] = new int[h];
		
		for(int i=0; i<h; i++)
		{
			for(int j=0; j<w; j++)
			{
				a[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<w; i++)
		{
			b[i] = scanner.nextInt();
		}
		
		for(int i=0; i<h; i++)
		{
			c[i] = 0;
			for(int j=0; j<w; j++)
			{
				c[i] += a[i][j]*b[j];
			}
		}
		
		for(int i=0; i<h; i++)
		{
			System.out.println(c[i]);
		}
	}
}