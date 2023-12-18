import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner (System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        String b = obj.next();
//        System.out.println(b.charAt(0));

        for (int i = 0;i<n;i++)
        {
            char p = b.charAt(i);
            int c = Character.getNumericValue(p);
            a[i] = c;
        }

//        for (int i = 0 ;i<n;i++)
//            System.out.println(a[i]);

        int[][] x = new int[n][n];

        for(int i = 0;i<n;i++)
        {
            int j = 0;
            while(i+j <= n-1)
            {
                if(i == 0)
                {
                  x[i][j] = a[j];
                }
                else
                {
                    x[i][j] = Math.abs(x[i-1][j] - x[i-1][j+1]);
                }
                j++;
            }
        }
        System.out.println(x[n-1][0]);

    }
}