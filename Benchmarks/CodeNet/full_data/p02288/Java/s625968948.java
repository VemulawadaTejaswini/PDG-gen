import java.util.Scanner;

class Main
{
    static int N;
    static int[]A = new int[10000000];

    public static void maxHeapify(int i)
    {
	int l = 2 * i;
	int r = 2 * i + 1;
	int largest;

	if(l <= N && A[l] > A[i])
	    largest = l;
	else 
	    largest = i;

	if(r <= N && A[r] > A[largest])
	    largest = r;

	if(largest != i)
	    {
		int b = A[i];
		A[i] = A[largest];
		A[largest] = b;
		maxHeapify(largest);
	    }
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);
	    

	N = In.nextInt();

	for(int i = 1; i <= N; i++)
	    A[i] = In.nextInt();
	
	for(int i = N / 2; i >= 1; i--)
	    maxHeapify(i);
	
	for(int i = 1; i <= N; i++)
	    System.out.print(" " + A[i]);
	
	System.out.println();
    }
}