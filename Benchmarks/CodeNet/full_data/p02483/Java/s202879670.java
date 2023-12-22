import java.util.Arrays;
import java.util.Scanner;

public class Main
{

	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int box[] = {a,b,c};
		Arrays.sort(box);
		
		for(int i=0; i<box.length; i++)
			System.out.print(box[i]+" ");
	}

}