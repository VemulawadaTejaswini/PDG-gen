import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int p = scanner.nextInt();
		
		for(int i=0; i<p; i++)
		{		
			String in = scanner.next();
			int n = scanner.nextInt();
			int m= scanner.nextInt();
			
			switch (in)
			{
				case "print":
					System.out.println(str.substring(n, m+1));
					break;
				case "reverse":
					String s = str.substring(n, m+1);
					String t="";
					for(int j=s.length(); j>0; j--)
					{
						t += s.substring(j-1, j);
					}
					str = str.replaceAll(s, t);
					break;
				case "replace":
					String rep = scanner.next();
					str = str.replaceAll(str.substring(n, m+1), rep);
					break;
			}
		}
	}
}