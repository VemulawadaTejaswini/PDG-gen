import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int home[][][] = new int[4][3][10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                for(int k = 0 ;k < 10 ; k++)
                    home[i][j][k] = 0;
            }
        }
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            home[b][f][r] += v;
        }
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                for(int k = 0 ; k < 10 ; k++)
                    System.out.print(" " + home[i][j][k]);
                System.out.println();
            }
            if(i != 3)
            {   
                for(int k = 0 ; k < 20 ; k++)
                    System.out.println("#");
                System.out.println();
            }
        }
    }
}
