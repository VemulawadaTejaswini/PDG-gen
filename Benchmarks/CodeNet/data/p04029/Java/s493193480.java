import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int candy=0;

		for(int i=0;i<=N;i++)
		{
			candy+=i;
		}
		System.out.println(candy);

	}
}