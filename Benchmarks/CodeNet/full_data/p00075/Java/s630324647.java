import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String[] ch = in.next().split(",");
			double BMI = Double.valueOf(ch[1])/(Double.valueOf(ch[2])*Double.valueOf(ch[2]));
			if(BMI>25)
				System.out.println(ch[0]);
		}
	}

}