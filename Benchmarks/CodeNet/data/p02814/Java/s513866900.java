import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N, M, lcm;
		N = in.nextInt();
		M = in.nextInt();
		lcm = 1;
		for (int i = 0; i < N; i++)
		{
			int temp = in.nextInt();
			int gcd = 1;
			for (int j = 1; j <= temp && j <= lcm; ++j)
			{
				if(temp % j == 0 && lcm % j == 0)
					gcd = j;
			}
			
			lcm = (temp * lcm) / gcd;
		}
		lcm /= 2;
		System.out.println(M/lcm - M/(lcm*2));
	}
}
