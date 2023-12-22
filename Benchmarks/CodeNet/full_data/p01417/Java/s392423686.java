import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        double[][] p = new double[n][3];
        for (int i = 0; i < n; i++) {
            p[i][0]=sc.nextDouble();
            p[i][1]=sc.nextDouble();
            p[i][2]=sc.nextDouble();
        }

        double ans = 0;
        for (int i = 0; i < 1<<n; i++) {
            if(Integer.bitCount(i)!=m)continue;
            ans=Math.max(ans, a(p,i));
        }
        System.out.println(ans);
    }
    static double a(double[][] p, int bit){
        int[] num = new int[Integer.bitCount(bit)];
        int cnt=0;
        for (int i = 0; bit!=0; i++) {
            if(bit%2==1){
                num[cnt]=i;
                cnt++;
            }
            bit = bit >> 1;
        }
        double res = 0.0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                double x1 = p[num[i]][0];
                double y1 = p[num[i]][1];
                double z1 = p[num[i]][2];
                double x2 = p[num[j]][0];
                double y2 = p[num[j]][1];
                double z2 = p[num[j]][2];
                x1 -=x2;
                y1 -=y2;
                z1 -=z2;
                x1*=x1;
                y1*=y1;
                z1*=z1;
                res += (x1+y1+z1);
            }
        }
        return res;
    }
}