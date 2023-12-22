import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt();
			if (N==0) break;
			
			int[] S = new int[N];
			for (int i = 0; i < N; i++) S[i] = sc.nextInt();
			Arrays.sort(S);
			int sum = 0;
			for (int i = 1; i < N - 1; i++) sum += S[i];
			System.out.println(sum / (N - 2));
		}
	}
}