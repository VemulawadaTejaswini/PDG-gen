

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //pieces
		int m = sc.nextInt(); //coordinates
		int[] dif = new int[m-1];
		int[] coor = new int[m];
		
		for(int i = 0; i < m; i++)
		{
			coor[i] = sc.nextInt();
		}
		Arrays.sort(coor);
		for(int i = 0; i < m-1; i++)
		{
			dif[i] = coor[i+1] - coor[i];
		}
		Arrays.sort(dif);
//		System.out.println(Arrays.toString(dif));
		
		int r = 0;
		for(int i = m-1-(n); i >= 0; i--)
		{
			r += dif[i];
		}
		System.out.println(r);
	}

}
