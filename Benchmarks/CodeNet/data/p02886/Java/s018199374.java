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
        D[0][1]=1;
        for (int x=0;x<N;++x)
        {
            D[x][0]=d.nextInt();
            if (x==1)
            {
                D[1][1]=D[0][0];
                sum+=D[1][0]*D[0][0];
            }
            else if (x>1)
            {
                D[x][1]=D[x-1][0]+D[x-1][1];
                sum+=D[x][0]*D[x][1];
            }
        }
        System.out.print(sum);
    }
}