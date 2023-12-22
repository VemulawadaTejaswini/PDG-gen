import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		
		String judge = "No";
		
		if((r<=x && x<=w-r) && (r<=y && y<=h-r))
		{
			judge = "Yes";
		}
		
		System.out.println(judge);
	}
}