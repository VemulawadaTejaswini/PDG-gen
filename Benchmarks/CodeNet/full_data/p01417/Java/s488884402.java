import java.util.*;
import java.math.BigDecimal;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        double[] l = new double[n];
        double[] a = new double[n];
        double[] b = new double[n];
        for(int i=0; i<n; i++){
            l[i] = sc.nextDouble();
            a[i] = sc.nextDouble();
            b[i] = sc.nextDouble();
        }

        double[][] dist = new double[n][n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                double ll = Math.abs(l[i]-l[j]);
                double aa = Math.abs(a[i]-a[j]);
                double bb = Math.abs(b[i]-b[j]);
                double sum = ll*ll+aa*aa+bb*bb;
                dist[i][j] = sum;
                dist[j][i] = sum;
            }
        }

        double max = 0.0;
        for(int bit=0; bit<1<<n; bit++){
            if(Integer.bitCount(bit)!=m) continue;
            double sum = 0.0;
            for(int i=0; i<n; i++){
                if((bit&(1<<i))>0){
                    for(int j=i+1; j<n; j++){
                        if((bit&(1<<j))>0){
                            sum += dist[i][j];
                        }
                    }
                }
            }
            max = Math.max(max, sum);
        }

        BigDecimal bi = new BigDecimal(String.valueOf(max));
        max = bi.setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.printf("%.6f\n",max);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}