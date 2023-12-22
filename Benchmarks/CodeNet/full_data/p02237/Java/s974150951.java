import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int N = In.nextInt();

	int[][]a = new int[N][N];

	for(int i = 0; i < N; i++)
	    {
		for(int j = 0; j < N; j++)
		    {
			a[i][j] = 0;
		    }
	    }

	for(int i = 0; i < N; i++)
	    {
		int l = In.nextInt();
		int m = In.nextInt();
		l--;
		for(int j = 0; j < m; j++)
		    {
			int o = In.nextInt();
			o--;
			a[l][o] = 1;
		    }
	    }

	for(int i = 0; i < N; i++)
	    {
		for(int j = 0; j < N; j++)
		    {
			System.out.print(a[i][j] + " ");
		    }
		System.out.println();
	    }

    }
}