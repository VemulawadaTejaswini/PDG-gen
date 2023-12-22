import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x;
		x = new int[100000];
		int i=0,j;
		while(true)
		{
			x[i] = sc.nextInt();
			if(x[i]==0)break;
			i++;
		}
		for(j=0;j<i;j++)
		{
			System.out.printf("Case %d: %d\n",j+1,x[j]);
		}
	}
}