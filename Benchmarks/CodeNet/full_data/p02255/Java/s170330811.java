import java.util.Scanner;

class a
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);
	int N;
	do
	    {
		 N = In.nextInt();
	    }while(1 >= N && N >= 100);



	
	int i,j;
	int []A = new int[N];
		for(i = 0; i < N; i++)
		    {
			do
			    {
				A[i] = In.nextInt();
			    }while(0 >= A[i] && A[i] >= 1000);
		    }
	
	for(i = 1; i <= N - 1; i++)
	    {
		int v = A[i];
		j = i - 1;
		
		while(j >= 0 && A[j] > v)
		    {
			A[j + 1] = A[j];
			j--;
			
		    }
		A[j + 1] = v;
		for(int m = 0; m < N; m++)
		    System.out.print(A[m] + " ");
		System.out.println();
	    }	
    }
}