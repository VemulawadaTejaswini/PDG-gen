import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();


	if( N>= 1 && N<= 81)
		{
		if(N%9 == 0 || N%8 == 0 || N%7 == 0 || N%6 == 0 || N%5 == 0 || N % 4 == 0 || N % 3 == 0 || N%2 == 0 ||N%1==0)
		System.out.println("Yes");
		}
	else
		System.out.println("No");
	}
}