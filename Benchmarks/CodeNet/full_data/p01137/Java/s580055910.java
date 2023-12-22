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
			int xx, yy, zz;
			
			for(z = 0;z < 100;z++)
			{
				if(e < z*z*z) break;
			}
			
			zz = z - 1;
			e -= zz * zz * zz;
			
			for(y = 0;y < 1000;y++)
			{
				if(e < y*y) break;
			}
			
			yy = y - 1;
			e -= yy*yy;
			
			xx = e;
			
			System.out.println(zz + yy + xx);
		}
	}
}