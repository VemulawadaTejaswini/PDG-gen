import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int array[] = new int[count];
		for(int i = 0;i< count;i++)
		{
			array[i] = scan.nextInt();
		}
		for(int i = count - 1;i > 0;i--)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println(array[0]);
	}
}