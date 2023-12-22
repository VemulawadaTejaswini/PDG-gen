import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static int e;
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		while(true)
		{
			e = sca.nextInt();
			if(e == 0) break;
			
			int x, y, z;
			int tmp;
			int min = Integer.MAX_VALUE;
			
			for(z = 0;z <= 100;z++)
			{
				tmp = z * z * z;
				if(tmp > e) break;
				
				for(y = 0;y <= 1000;y++)
				{
					tmp = z * z * z + y * y;
					if(tmp > e) break;
					
					for(x = 0;x <= 1000000;x++)
					{
						tmp = x + y * y + z * z * z;
						
						if(tmp > e) break;
						if(tmp == e)
						{
							tmp = x + y + z;
							if(tmp < min) min = tmp;
						}
					}
				}
			}
			
			System.out.println(min);
		}
	}
}