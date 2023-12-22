import java.util.Arrays;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				long[] num = new long[2];
					num[0] = sc.nextLong();
					num[1] = sc.nextLong();
						Arrays.sort(num);
				long p = num[0] * num[1]; 
				long a = 0;
					for(;num[1]%num[0] != 0;)
					{
						a = num[1] % num[0];
						num[1]=a; num[0]=num[1]; a=num[0]; 
					}
						System.out.println(a +" "+ p/a);
			}
	}
}