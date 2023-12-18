import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        int N = in1.nextInt();
        int D[][]=new int [N][2];
        Scanner d = new Scanner(System.in);
        int sum=0;
        for (int x=0;x<N;x++)
        {
            D[x][0]=d.nextInt();
        }
        D[N-1][1]=1;
        for (int x=N-2;x>=0;x--)
        {
            D[x][1]=D[x+1][0];
            if (x<N-2)
            {
                D[x][1]+=D[x+1][1];
            }
        }
        for (int x=0;x<N-1;x++)
        {
            sum+=D[x][0]*D[x][1];
        }
        System.out.print(sum);
    }
}