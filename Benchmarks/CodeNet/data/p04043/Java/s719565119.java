import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		String[] ABC = new int[a];
		String small = ABC[0]; 
		String output = "";
		for (int x : ABC)
		{
			ABC[x] = scan.next();
		}
		for (int i = 1; i < ABC.length;i++)
		{
			for (int x = 1; x < ABC.length;x++)
				if (small > ABC[x]) small = ABC[x];
			output+=small;
		}
		System.out.println(small);
	}
}