import java.util.Scanner;

public class Already2018 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String determin = s.substring(0,4);

		if(determin.equals("2017"))
		{
			s = s.replace("2017","2018");
		}
		
		System.out.println(s);
	}	
}
