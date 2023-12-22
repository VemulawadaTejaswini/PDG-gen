import java.util.Scanner;


class Treasure
{
	int x;
	int y;
	boolean isTreasure;
	
	public Treasure(int x,int y)
	{
		this.x = x;
		this.y = y;
		this.isTreasure = false;
	}
	
	public void isTreasure(Robot pri_r,Robot aft_r)
	{
		if(pri_r.x == aft_r.x)
		{
			if(pri_r.y < aft_r.y)
			{
				for(int i = pri_r.y; i <= aft_r.y;i++)
				{
					this.isTreasure(pri_r.x, i);
				}
			}
			else
			{
				for(int i = aft_r.y; i <= pri_r.y;i++)
				{
					this.isTreasure(pri_r.x, i);
				}
			}
		}
		if(pri_r.y == aft_r.y)
		{
			if(pri_r.x < aft_r.x)
			{
				for(int i = pri_r.x; i <= aft_r.x;i++)
				{
					this.isTreasure(i, pri_r.y);
				}
			}
			else
			{
				for(int i = aft_r.x; i <= pri_r.x;i++)
				{
					this.isTreasure(i,pri_r.y);
				}
			}
		}
	}
	
	public void isTreasure(int x,int y)
	{
		if(this.x == x && this.y == y)
		{
			if(this.isTreasure == false)
			{
				this.isTreasure = true;
			}
		}
	}
	
}

class Robot
{
	int x;
	int y;
	public Robot()
	{
		this.x = 10;
		this.y = 10;
	}
	
	public void move(char mes,int distance)
	{
		switch(mes)
		{
			case('N'):
				this.y += distance;
				break;
			case('S'):
				this.y -= distance;
				break;
			case('E'):
				this.x += distance;
				break;
			case('W'):
				this.x -= distance;
				break;
		}
	}
	
	public void printRobot()
	{
		System.out.println("(" + x + "," + y + ")");
	}
}

class Run
{
	Robot aft_robot = new Robot();
	Robot pri_robot = new Robot();
	Treasure[] treasure;
	Scanner sc = new Scanner(System.in);
	int N;
	int M;
	
	public void run()
	{
		while(true)
		{
			N = sc.nextInt();
			treasure = new Treasure[N];
			if(N == 0)break;
			for(int i = 0; i < N; i++)
			{
				int x = sc.nextInt();
				int y = sc.nextInt();
				treasure[i] = new Treasure(x,y);
			}
			M = sc.nextInt();
			for(int i = 0; i < M; i++)
			{
				char mes = sc.next().charAt(0);
				int distance = sc.nextInt();
				aft_robot.move(mes,distance);
				for(int j = 0; j < N; j++)
				{
					treasure[j].isTreasure(pri_robot, aft_robot);
				}
				pri_robot = aft_robot;
			}
			
			boolean check = true;
			for(int i = 0; i <N; i++)
			{
				if(treasure[i].isTreasure == false) check = false;
			}
			if(check == false) System.out.println("No");
			else System.out.println("Yes");
		}
	}
}
public class Main {
	static Run run = new Run();
	public static void main(String[] args)
	{
		run.run();
	}

}