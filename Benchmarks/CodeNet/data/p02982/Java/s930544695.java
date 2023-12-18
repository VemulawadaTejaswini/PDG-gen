
import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];

        for(int tmp=0; tmp < n; tmp++){
            for(int tmp1= 0; tmp1< d ; tmp1++) {
                int tmpx = sc.nextInt();
                x[tmp][tmp1] = tmpx;
            }
        }
        int result = 0;

        for(int tmp=0; tmp<n;tmp++){
            for(int tmp1=tmp + 1; tmp1<n; tmp1++){
                long sum = 0;
                for(int tmp2=0;tmp2<d;tmp2++){
                    long part = (long) Math.pow(Math.abs(x[tmp][tmp2] - x[tmp1][tmp2]),2);
                    sum += part;
                }
                double sumsqurt = Math.sqrt(sum);
                if(sumsqurt % 1 == 0){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
