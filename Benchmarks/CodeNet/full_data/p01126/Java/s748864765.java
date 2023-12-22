
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt(), M = sc.nextInt(), A = sc.nextInt();
			if (N==0&&M==0&&A==0) break;
			int[][] connect = new int[M + 1][N + 1];
			for (int i = 0; i < M; i++)
			{
				int h = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
				connect[h][p] = q;
				connect[h][q] = p;
			}
			for (int i = M; i > 0; i--)
			{
				if (connect[i][A] != 0)
				{
					A = connect[i][A];
				}
			}
			System.out.println(A);
		}
	}
}
/*
4 4 1
3 1 2
2 2 3
3 3 4
1 3 4
0 0 0
*/