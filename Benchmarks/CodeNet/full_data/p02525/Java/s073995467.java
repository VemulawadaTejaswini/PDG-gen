import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] set = new double[1000];
        
        while(true){
            double sum = 0;
            int n = sc.nextInt();
            if(n==0) break;
            for (int i=0;i<n;i++) {
                set[i] = sc.nextDouble();
                sum += set[i];
            }
            double ave = sum / n;
            double sigma2 = 0;
            for (int i=0;i<n;i++) {
                sigma2 += (set[i]-ave)*(set[i]-ave)/n;
            }
            System.out.printf("%.8f\n",Math.sqrt(sigma2));
        }
    }
}