import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		int[] points = new int[3];
		
		for(;;)
		{
			String[] pointsStr = input.readLine().split(" ");
			
			for(int insert = 0; insert <points.length; insert++)
			{
				points[insert] = Integer.parseInt(pointsStr[insert]);
			}
			
			if((points[0] == -1)&&(points[1] == -1)&&(points[2] == -1))
			{
				break;
			}
			
			else if((points[0] == -1)||(points[1] == -1))
			{
				System.out.println("F");
			}
			
			else if(points[0] + points[1] >= 80)
			{
				System.out.println("A");
			}
			
			else if((65 <= points[0] + points[1])&&(points[0] + points[1] <80))
			{
				System.out.println("B");
			}
			
			else if(((50 <= points[0] + points[1])&&(points[0] + points[1] <65)||((30 <= points[0] + points[1])&&(points[0] + points[1] <50)&&(points[2] >=50))))
			{
				System.out.println("C");
			}
			
			else if(((30 <= points[0] + points[1])&&(points[0] + points[1] <50))&&(points[2] <50))
			{
				System.out.println("D");
			}
			
			else
			{
				System.out.println("F");
			}
		}
	}

}

