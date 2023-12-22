import java.util.Scanner;
import java.util.Arrays;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] x = new int[10];
		
		Scanner cin = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
     		x[i] = cin.nextInt();
		}
		
		Arrays.sort(x);
		
		for (int i = 9; i >= 7; i--) {
			 System.out.println(String.valueOf(x[i]));
		}
	}
}