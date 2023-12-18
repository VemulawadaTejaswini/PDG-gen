import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long na[] = new long[5];
		long ans = 0;
		long n = sc.nextLong();
		na[0] = sc.nextInt();
		long min = na[0];
		for (int i = 1; i < 5; i++)
		{
			na[i] = sc.nextLong();
			if(min > na[i])
			{
				min = na[i];
			}
		}
		ans = (long)(Math.ceil(((double)n)/(double)min));
		ans += 4;

		System.out.println(ans);

	}
}