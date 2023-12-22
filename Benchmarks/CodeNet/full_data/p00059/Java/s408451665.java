import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			float[] x = new float[4];
			float[] y = new float[4];
			
			for(int i=0; i<4; i++)
			{
				x[i] = scanner.nextFloat();
				y[i] = scanner.nextFloat();
			}
				
			String output = "NO";
			if(x[0]<=x[3] && x[2]<=x[1] && y[0]<=y[3] && y[2]<=y[1])
			{
				output = "YES";
			}
		
			System.out.println(output);
		}
	}
}