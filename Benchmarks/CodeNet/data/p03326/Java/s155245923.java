import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];

        for(int i=0; i<n; i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }

        long[][] sum = new long[8][n];
        long[]   tmp = new long[8];

        for(int i=0; i<n; i++){
            sum[0][i] = x[i] + y[i] + z[i];
            sum[1][i] = x[i] + y[i] - z[i];
            sum[1][i] = x[i] - y[i] + z[i];
            sum[2][i] = x[i] - y[i] - z[i];
            sum[3][i] = x[i] + y[i] + z[i];
            sum[4][i] = -x[i] + y[i] - z[i];
            sum[5][i] = -x[i] + y[i] + z[i];
            sum[6][i] = -x[i] - y[i] - z[i];
            sum[7][i] = -x[i] - y[i] + z[i];
        }

        for(int i=0; i<sum.length; i++){
            Arrays.sort(sum[i]);
            tmp[i] = 0;
            for(int j=0; j<m; j++){
                tmp[i] += sum[i][j];
            }
            tmp[i] = Math.abs(tmp[i]);
        }
        Arrays.sort(tmp);

        System.out.println(tmp[7]);
    }
}