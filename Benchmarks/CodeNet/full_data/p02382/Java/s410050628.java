import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, i;
        double d_1, d_2, d_3, d_n;
        n = sc.nextInt();
        d_1 = 0.0;
        d_2 = 0.0;
        d_3 = 0.0;
        d_n = 0.0;
        double[] x = new double[n];
        double[] y = new double[n];
        for(i=0;i<n;i++){
            x[i] = sc.nextDouble();
            //System.out.println(x[i]);
        }
        for(i=0;i<n;i++){
            y[i] = sc.nextDouble();
            //System.out.println(y[i]);
        }
        for(i=0;i<n;i++){
            d_1 += Math.abs(x[i]-y[i]);
            d_2 += Math.pow(Math.abs(x[i]-y[i]),2);
            d_3 += Math.pow(Math.abs(x[i]-y[i]),3);
            if(Math.abs(x[i]-y[i])>d_n)d_n = Math.abs(x[i]-y[i]);
            
        }
        System.out.println(d_1);
        System.out.println(Math.sqrt(d_2));
        System.out.println(Math.cbrt(d_3));
        System.out.println(d_n);
        
    }
}
