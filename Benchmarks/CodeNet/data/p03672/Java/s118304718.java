import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}

	void run()
	{
		String s = sc.nextLine();
		for(int i=(s.length() - 1)/2; i>0; i--)
		{
			if(s.substring(0, i).equals(s.substring(i, 2*i)))
			{
				System.out.println(i * 2);
				return;
			}
		}
	}
}
