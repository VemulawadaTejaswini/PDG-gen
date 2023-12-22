import java.util.Arrays;
import java.util.Scanner;

public class  Main 
{
	public static void main(String arg[])
	{
		int a[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			a[i]=scan.nextInt();		
		}
		Arrays.sort(a);
		for(int i=0; i<3; i++)
			System.out.println(a[10-i-1]);
	}

}