

import java.util.Scanner;
public class Main 
{ 
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);  
       int n,m,l;
       n = sc.nextInt();
       m = sc.nextInt();
       l = sc.nextInt();
       long [] [] A = new long [n][m];
       long [] [] B = new long [m][l];
       for(int i=0; i<n; i++)  //input
       {
           for (int j = 0; j<m; j++)
           {
               A[i][j] = sc.nextLong();
           }
       }
        for(int i=0; i<m; i++)  //input
       {
           for (int j = 0; j<l; j++)
           {
               B[i][j] = sc.nextLong();
           }
       }
        
        for(int i=0; i<n; i++) //multiplying
        {
            for(int j = 0; j< l; j++)
            {
                long sum = 0;
                for(int k = 0; k< m;k++)
                {
                   sum = sum + A[i][k] * B[k][j];
                }
                if(j!=l-1)
                    {
                        System.out.print(sum + " ");
                    }
                else System.out.println(sum);
            
            }
        }
    }
}

