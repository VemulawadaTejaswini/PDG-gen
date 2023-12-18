import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		String answer = ((a < c) &&(c < b)) || ((b < c) &&(c < a)) ?  "Yes" : "No";

		System.out.println(answer);

		sc.close();
	}

}
