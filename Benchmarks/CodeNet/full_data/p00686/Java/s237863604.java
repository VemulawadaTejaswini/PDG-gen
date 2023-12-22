

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int w = sc.nextInt();
			if(w == 0)break;
			int h = sc.nextInt();
			int x = 1;
			int y = 1;
			int facing = 0; //UP RIGHT DOWN LEFT!
			
			while(true)
			{
				String com = sc.next();
				facing = facing%4;
				if(facing < 0)facing += 4;
			
				if(com.equals("STOP"))
				{
					System.out.println(x + " " + y);
					break;
				}
				else if(com.equals("RIGHT"))
				{
					facing += 1;
				}
				else if(com.equals("LEFT"))
				{
					facing -= 1;
				}
				if(com.equals("FORWARD"))
				{
					int arg = sc.nextInt();
					if(facing == 0)y+=arg;
					if(facing == 1)x+=arg;
					if(facing == 2)y-=arg;
					if(facing == 3)x-=arg;
				}
				else if(com.equals("BACKWARD"))
				{
					int arg = sc.nextInt();
					if(facing == 0)y-=arg;
					if(facing == 1)x-=arg;
					if(facing == 2)y+=arg;
					if(facing == 3)x+=arg;
				}
				
				if(x > w) x = w;
				if(y > h) y = h;
				if(x < 1) x = 1;
				if(y < 1) y = 1;
			}
		}
				

	}

}

