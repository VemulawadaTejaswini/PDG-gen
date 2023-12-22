import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double result = 100000;
				for(int i = 0; n > i; i++)
				{
					result = result * 1.05;
					result = ((int)((result + 999)/1000))*1000;
				}
			System.out.println((int)result);
	}
}