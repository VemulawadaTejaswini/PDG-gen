import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		while(scn.hasNext())
		{
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.printf("%d %d\n", getCommonDivider(a, b), getCommonMultiplier(a, b));
		}
	}

	public static int getCommonDivider(int a, int b)
	{
		if (b == 0) return a;
		int q = a % b;
		return getCommonDivider(b, q);
	}

	public static int getCommonMultiplier(int a, int b)
	{
		int v = getCommonDivider(a, b);
		int va = a / v;
		int vb = b / v;
		return v*(va*vb);
	}
}