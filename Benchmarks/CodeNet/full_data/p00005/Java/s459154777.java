import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				int[] num = new int[2];
			while(sc.hasNext())
			{
				num[0] = sc.nextInt();
				num[1] = sc.nextInt();
				Arrays.sort(num);
					for(int i = num[1];;i--)
					{
						if(num[0]%i == 0 && num[1]%i == 0)
						{
							System.out.println(i + " " + (num[0]*num[1]/i));
							break;
						}
					}
			}
	}
}