import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		int score = 0;
		
		for(int i = 0; i < n; i++)
		{
			boolean p = s.charAt(i) == 'p';
			if(i%2==1)
			{
				if(!p)score++;
			}
			else if(p)score--;
		}
		System.out.println(score);
	}

}
