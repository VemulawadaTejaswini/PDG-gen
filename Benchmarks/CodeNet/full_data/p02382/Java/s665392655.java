import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        one(x,y);
        two(x,y);
        three(x,y);
        infi(x,y);
        
    }
    public static void one(long[] x,long[] y){
        double d = 0;
        for(int i = 0; i < x.length; i++){
            d += Math.abs(x[i]-y[i]);
        }
        System.out.println(String.format("%.5f",d));
    }
    public static void two(long[] x,long[] y){
        double d = 0;
        for(int i = 0; i < x.length; i++){
            d += Math.pow(Math.abs(x[i]-y[i]),2);
        }
        d = Math.sqrt(d);
        System.out.println(String.format("%.5f",d));
    }
    public static void three(long[] x,long[] y){
        double d = 0;
        for(int i = 0; i < x.length; i++){
            d += Math.pow(Math.abs(x[i]-y[i]),3);
        }
        d = Math.cbrt(d);
        System.out.println(String.format("%.5f",d));
    }
    public static void infi(long[] x,long[] y){
        double[] d = new double[x.length];
        for(int i = 0; i < x.length; i++){
            d[i] = Math.abs(x[i]-y[i]);
        }
        Arrays.sort(d);
        System.out.println(String.format("%.5f",d[x.length-1]));
    }
}
