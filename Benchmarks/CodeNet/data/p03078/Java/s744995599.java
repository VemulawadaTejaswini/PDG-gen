import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("2 2 2 8 4 6 1 5 3 8");
		int x, y, z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		long nax[] = new long[x];
		long nay[] = new long[y];
		long naz[] = new long[z];
		int k = sc.nextInt();
		for (int i = 0; i < x; i++)
		{
			nax[i] = sc.nextLong();
		}
		for (int i = 0; i < y; i++)
		{
			nay[i] = sc.nextLong();
		}
		for (int i = 0; i < z; i++)
		{
			naz[i] = sc.nextLong();
		}
		long ans[] = new long[x*y*z];
		int l = 0;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < x; j++)
			{
				for (int m = 0; m < x; m++)
				{
					ans[l] = nax[i] + nay[j] + naz[m];
					l++;
				}
			}
		}
		Arrays.parallelSort(ans);
		for  (int i = 0; i < k; i++)
		{
			System.out.println(ans[x*y*z-i-1]);
		}

	}
}