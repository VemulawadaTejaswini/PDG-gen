import java.util.Scanner;

class Main
{

    static int n,t;
    static int[][]a = new int[100][100];
    static int[]c  = new int[100];
    static int[]d = new int[100];
    static int[]f = new int[100];

    public static void visit(int l)
    {
	int m;
	c[l] = 1;
	d[l] = ++t;

	for(m = 0; m < n; m++)
	    {
		if(a[l][m] == 0)
		    continue;

		if(c[m] == 0)
		    {
			visit(m);
		    }
	    }
	
	c[l] = 2;
	f[l] = ++t;
    }
    
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int l,m,k;

	n = In.nextInt();

	for(int i = 0; i < n; i++)
	    {
		for(int j = 0; j < n; j++)
		    {
			a[i][j] = 0;
		    }
	    }
	for(int i = 0; i < n; i++)
	    {
		l = In.nextInt();
		k = In.nextInt();
		l--;
		for(int j = 0; j < k; j++)
		    {
			m = In.nextInt();
			m--;
			a[l][m] = 1;
		    }
	    }


	int p;
	for(p = 0; p < n; p++)
	    c[p] = 0;

	t = 0;

	for(p = 0; p < n; p++)
	    {
		if(c[p] == 0 ) visit(p);
	    }

	for(p = 0; p < n; p++)
	    {
		System.out.println((p + 1) + " " + d[p] + " " + f[p]);
		}
    }
}