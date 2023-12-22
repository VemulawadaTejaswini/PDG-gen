import java.util.*;

public class Main
{
	public static void main(String[] ars)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int extra = 0;
		for(int C = 1; C < N; C++) {
			int rhs = N-C;
			for(int A = 1; A <= (int) Math.sqrt(rhs); A++) {
				if((int) (rhs/A) == (float) rhs/A  && A != (int) rhs/A) {
					count++;
				} else if((int) (rhs/A) == (float) rhs/A  && A == (int) rhs/A) {
					extra++;
				}
			}
		}
		System.out.println(count*2+extra);
	}
	
}
