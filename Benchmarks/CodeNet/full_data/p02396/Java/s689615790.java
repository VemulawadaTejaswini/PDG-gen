import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int i=1, n;
		Scanner input = new Scanner(System.in);
		while(true)
		{
			n = input.nextInt();
			if(n == 0){
				break;
			}
			else {
				System.out.println("Case " + i + ": " + n);
			}
			i++;
		}
	}
}