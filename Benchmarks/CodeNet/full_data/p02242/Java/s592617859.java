import java.util.*;

class Main
{
    static int[][]M = new int[100][100];

    static void Sing(int n)
    {
	int minv;
	int[]d = new int[100];
	int[]cl = new int[100];

	for(int i = 0; i < n; i++)
	    {
		d[i] = 200000;
		cl[i] = 0;
	    }

	d[0] = 0;
	cl[0] = 1;

	while(true)
	    {
		minv = 200000;
		int u = -1;

		for(int i = 0; i < n; i++)
		    {
			if(minv > d[i] && cl[i] != 2)
			    {
				u = i; 
				minv = d[i];
			    }
		    }

		if(u == -1) break;
		cl[u] = 2;

		for(int i = 0; i < n; i++)
		    {
			if(cl[i] != 2 && M[u][i] != 200000)
			    {
				if(d[i] > d[u] + M[u][i])
				    {
					d[i] = d[u] + M[u][i];
					cl[i] = 1;
				    }
			    }
		    }
	    }

	for(int i = 0; i < n; i ++)
	    {
		System.out.println(i + " " + (d[i] == 200000 ? -1 : d[i]));
	    }
    }
 
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();

	for(int i = 0; i < n; i++)
	    {
		for(int j = 0; j < n; j++)
		    {
			M[i][j] = 200000;
		    }
	    }

	int p,q,r,s;

	for(int i = 0; i < n; i++)
	    {
		p = In.nextInt();
	        q = In.nextInt();

		for(int j = 0; j < q; j++)
		    {
			r = In.nextInt();
			s = In.nextInt();
			M[p][r] = s;
		    }
	    }

	Sing(n);
    }
}