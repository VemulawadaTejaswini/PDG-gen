import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		System.out.print("A B? ");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if ((A - (2 * B))>0)
		{
			System.out.println(A - (2 * B));
			System.out.println("We have a window with a horizontal length of " + A + ", and two curtains, each of length " + B + ", that cover both ends of the window, for example. The uncovered part has a horizontal length of " + (A - (2 * B)) + ".");
		}
		else if (B > A)
		{
			System.out.println(0);
			System.out.println("Each curtain may be longer than the window.");
		}
		else
		{
			System.out.println(0);
			System.out.println("If the window is completely covered, print 0.");
		}

	}
}