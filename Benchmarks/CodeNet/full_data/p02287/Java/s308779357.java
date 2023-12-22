import java.util.Scanner;

class Main
{
    public static int parent(int i)
    {
	return i / 2;
    }

    public static int left(int i)
    {
	return i * 2;
    }

    public static int right(int i)
    {
	return 2 * i + 1;
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int N = In.nextInt();

	int[]A = new int[10001];

	for(int i = 1; i <= N; i++)
	    {
		A[i] = In.nextInt();
	    }

	for(int i = 1; i <= N; i++)
	    {
		System.out.print("node " + i + ": key = " + A[i] + ", ");

		if(parent(i) >= 1) System.out.print("parent key = " + A[parent(i)] + ", ");
		if(left(i) <= N) System.out.print("left key = " + A[left(i)] + ", ");
		if(right(i) <= N) System.out.print("right key = " + A[right(i)] + ", ");

		System.out.println();
	    }
    }
}