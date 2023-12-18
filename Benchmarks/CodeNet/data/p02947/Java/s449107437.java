
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 class Main {


    private static int min(int a, int b)
    {
        return (a < b) ? a : b;
    }


        static long binomialCoeff(int n, int k)
        {
            long C[][] = new long[n+1][k+1];
            int i, j;

            for (i = 0; i <= n; i++)
            {
                for (j = 0; j <= min(i, k); j++)
                {
                    if (j == 0 || j == i)
                        C[i][j] = 1;

                    else
                        C[i][j] = C[i-1][j-1] + C[i-1][j];
                }
            }

            return C[n][k];
        }


        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        String[] strings=new String[n];
        for(int i=0;i<n;i++){
            char[] s=in.next().toCharArray();
            Arrays.sort(s);
            strings[i]=new String(s);
        }
        Arrays.sort(strings);
        long count=0;
        for(int i=1;i<n;){
            long c=0;
            boolean flag=false;
            while(i<n && strings[i].equals(strings[i-1])) {
                flag=true;
                c++;
                i++;
            }
            if(c>0) {
               // c++;
                //count += binomialCoeff(c, 2);
                count+= (c*(c+1))/2;
            }
            if(!flag)
                i++;

        }
            System.out.println(count);


    }
}
