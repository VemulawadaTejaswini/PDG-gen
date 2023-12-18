
import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc= new Scanner(System.in);

		boolean tmp = true, tmp2 = true;

		if (sc.next() == "D")
		{
			tmp = false;
		}

		if (sc.next() == "D")
		{
			tmp2 = false;
		}

		if (!tmp)
		{
			tmp2 = !tmp2;
		}

		if (tmp2)
		{
			System.out.println("H");
		}
		else
		{
			System.out.println("D");
		}
	}
}
