import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int hour = (value/60)/60;
		int min = (value/60)%60;
		int sec = value%60;
		
		System.out.println(String.format("%s:%s:%s",hour,min,sec));
	}

}

