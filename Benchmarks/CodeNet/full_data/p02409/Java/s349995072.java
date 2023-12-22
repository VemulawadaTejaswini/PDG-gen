import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int data[][][] = new int[4][3][10];
        int n,b,f,r,v;

        n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            b=sc.nextInt(); f=sc.nextInt(); r=sc.nextInt(); v=sc.nextInt();
            data[b-1][f-1][r-1]+=v;
        }

        for(int i=0; i<4; i++)
        {
            for(int k=0; k<3; k++)
            {
                for(int m=0; m<10; m++)
                {
                    System.out.printf(" %d",data[i][k][m]);
                }
                //System.out.printf("%d\n",data[i][k][9]);
                System.out.printf("\n");
            }
            if(i<3) System.out.println("####################");
        }

        sc.close();
    }
}
