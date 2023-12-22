
public class clsCommon {

	public static void main(String args[])
	{
		int min = 1;
		int max = 9;

		for (int x=min;x<=max;x++)
		{
			for (int y=min;y<=max;y++)
			{
				System.out.println(x + "x" + y + "=" + x*y );
			}
		}
	}
}