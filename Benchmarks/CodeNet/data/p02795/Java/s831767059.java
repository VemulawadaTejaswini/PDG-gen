import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		int large = h> w ? h :w;

		System.out.println((n-1)/large + 1);
	}

}