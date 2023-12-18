import java.util.Scanner;
public class Main
{
  	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	long result = 0;
      	for(int i = 1; i <= a; i++)
      	{
      		for(int j = 1; j <= a; j++)
      		{
      			for(int k = 1; k <= a; k++)
      			{
      				boolean judge = true;
      				for(int l = i; l > 0 && judge; l--)
      				{
      					if(i % l == 0 && j % l == 0 && k % l == 0)
      					{
      						judge = false;
      						result += l;
      					}
      				}
      			}
      		}
      	}
      	
      	System.out.println(result);
    }
}
