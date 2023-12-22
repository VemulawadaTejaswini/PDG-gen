import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(num[i] == 0)
			{
				System.out.println(i + 1);
				break;
			}
		}
	}
}
