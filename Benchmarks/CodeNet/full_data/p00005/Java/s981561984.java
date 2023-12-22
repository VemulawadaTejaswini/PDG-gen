import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				long[] num = new long[2];
			while(sc.hasNext())
			{
				num[0] = sc.nextLong();
				num[1] = sc.nextLong();
				Arrays.sort(num);
					for(long i = num[1];;i--)
					{
						if(num[0]%i == 0 && num[1]%i == 0)
						{
							System.out.println(i);
							break;
						}
					}
				long LCM = 1;
					for(long i = 2; num[1] != i;)
					{
						if(num[0]%i == 0 && num[1]%i == 0)
						{
							num[0] = num[0]/i;
							num[1] = num[1]/i;
							LCM = LCM * i;
						} else {
							i++;
						}
					}
				System.out.println(LCM * num[0] * num[1]);
			}
	}
}