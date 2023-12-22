import java.util.Arrays;
import java.util.Scanner;

public class Main

{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int [10];
		int b[]= new int [10];

		for(int i=0; i<10; i++)
			a[i]=sc.nextInt();
		for(int i=0; i<10; i++)
			b[i]=sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		int suma = 0;
		int sumb = 0;
		for(int i=9;i>=7;i--)
		{
			suma+=a[i];
			sumb+=b[i];
		}
		System.out.println(suma+" "+sumb);
	}
}