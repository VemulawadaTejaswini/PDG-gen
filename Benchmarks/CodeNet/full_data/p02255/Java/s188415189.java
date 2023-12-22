import java.util.Scanner;

class a
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int N = In.nextInt();
	int []A = new int[n];

	int i,j;

	for(i = 0; i < n; i++)
	    {
		A[i] = In.nextInt();
	    }

	for(i = 1; i < n; i++)
	    {
		int v = A[i];
		j = i - 1;
		
		while(j >= 0 && A[j] > v)
		    {
			A[j + 1] = A[j];
			j--;
			
		    }
		A[j + 1] = v;
		
		for(int m = 0; m < n; m++)
		    System.out.print(A[m] + " ");
		System.out.println();
	    }	
    }
}