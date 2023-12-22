import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int   n;
		int[] dat;
		
		n = sc.nextInt();
		dat = new int[n];
		for(int i=0; i<n; i++)
			dat[i] = sc.nextInt();
		
		System.out.print(dat[n-1]);
		for(int i=n-2; i>=0; i--)
			System.out.print(" "+ dat[i]);
		System.out.println();
	}
}