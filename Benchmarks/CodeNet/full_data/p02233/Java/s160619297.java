import java.util.Scanner;

class Main
{
    static  int[]F = new int[44];

    public static void makeFibona()
    {
	F[0] = 1;
	F[1] = 1;

	for(int i = 2; i < F.length; i++)
	    F[i] = F[i - 2] + F[i - 1];
    }

    public static int Fibona(int n)
    {
	if(n == 0 || n == 1)
	    return F[n];

	return F[n];

    }
 
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);
 
	int N = In.nextInt();

	makeFibona();

	System.out.println(Fibona(N));
    }
}