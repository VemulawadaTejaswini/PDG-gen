import java.util.Scanner;

public class Main
{

    public static int[]Sy(int n)
    {	
	Scanner Instd = new Scanner(System.in);
	int []s = new int[n];
	
	for(int i = 0; i < n; i++)
	    {
	        s[i] = Instd.nextInt();
	    }
	return s;
    }

    public static int[] Ty(int q)
    {
	Scanner std = new Scanner(System.in);
	int []t = new int[q];
	
	for(int i = 0; i < q; i++)
	    {
	        t[i] = std.nextInt();
	    }
	return t;
    }

    public static int Search(int[]s, int key,int n)
    {
	for(int i = 0; i < n; i++){
	    if(s[i] == key)
		return 1;
	}
	return 0;
	    
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();
	int []S = Sy(n);

	int q = In.nextInt();
	int []T = Ty(q);

	int count = 0;

	for(int i = 0; i < q; i++)
	    {
		 count += Search(S,T[i],n);
	    }

	System.out.println(count);
    }
}