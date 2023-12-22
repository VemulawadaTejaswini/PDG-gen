import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int s = stdIn.nextInt();
		
		int h = s/3600;
		int m = (s-h*3600)/60;
		
		System.out.println(h+":"+m+":"+(s-h*3600-m*60));
	}

}