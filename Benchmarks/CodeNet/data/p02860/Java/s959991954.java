import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();


			String w1 = word.substring(0,(word.length()/2));
			String w2 = word.substring(word.length()/2,word.length());
			if(w1.equals(w2))
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
	}
}