import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int[] h = new int[300];
		int[] w = new int[300];
		Scanner sc = new Scanner(System.in);
		int count=0,i=0,j=0,k=0;
		while(true)
		{
			h[count] = sc.nextInt();
			w[count] = sc.nextInt();
			if((h[count]==0)&&(w[count]==0))break;
			count++;
		}
		for(i=0;i<count;i++)
		{
			for(j=0;j<w[i];j++)
			{
				for(k=0;k<h[i];k++)
				{
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}