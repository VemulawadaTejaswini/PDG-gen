import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[3];
		a[0] = scanner.nextInt();
		a[1] = scanner.nextInt();
		a[2] = scanner.nextInt();
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					int buf = a[i];
					a[i] = a[j];
					a[j] = buf;
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+(i<a.length-1?" ":"\n"));
		}
	}
}