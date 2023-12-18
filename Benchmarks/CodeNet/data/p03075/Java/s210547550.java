import java.util.*;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new java.util.Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int distance[] = new int[10];
		
		distance[0] = b - a;
		distance[1] = c - a;
		distance[2] = d - a;
		distance[3] = e - a;
		distance[4] = c - b;
		distance[5] = d - b;
		distance[6] = e - b;
		distance[7] = d - c;
		distance[8] = e - c;
		distance[9] = e - d;
		
		int flag = 1;

  		for(int i = 0; i < 10; i++)
		{
			if(k < distance[i])
			{
				flag = 0;
				break;
			}
		}
  		
  		if(flag == 1)
  		{
  			System.out.println("Yay!");
  		}
  		else 
  		{
			System.out.println(":(");
		}

	}

}
