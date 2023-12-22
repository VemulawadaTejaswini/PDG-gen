import java.util.Scanner;

class Main
{

    static int[]Sy(int n)
    {	
	Scanner Instd = new Scanner(System.in);
	int []s = new int[n];
	
	for(int i = 0; i < n; i++)
	    {
	        s[i] = Instd.nextInt();
	    }
	return s;
    }

    static int[] Ty(int q)
    {
	Scanner std = new Scanner(System.in);
	int []t = new int[q];
	
	for(int i = 0; i < q; i++)
	    {
	        t[i] = std.nextInt();
	    }
	return t;
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();
	int []S = Sy(n);

	int q = In.nextInt();
	int []T = Ty(q);

	int count = 0;

	for(int i = 0; i < n; i++){
	    for(int j = 0; j < q; j++){

		if(S[i] == T[j])
		    count++;

	    }
	}
	System.out.println(count);
    }
}