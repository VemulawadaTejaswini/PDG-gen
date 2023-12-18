import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int first, second;
		first = sc.nextInt();
		second = sc.nextInt();
		
		if(first > 0 && first < 10 && second > 0 && second < 10)
			System.out.println(first * second);
		else
			System.out.println("-1");
	}
}