import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        int[] x = new int[cnt];
        int[] y = new int[cnt];
        for(int i = 0; i < cnt; i ++)
            x[i] = input.nextInt();
        for(int j = 0; j < cnt; j ++)
            y[j] = input.nextInt();
        man(x, y);
        euc(x, y);
        min(x, y);
        che(x, y);
    }
    
    public static void man(int[] x, int[] y){
        double sum = 0;
        for(int i = 0; i < x.length; i ++)
            sum += Math.abs(x[i] - y[i]);
        System.out.println(sum);
    }
    
    public static void euc(int[] x, int[] y){
        double d = 0;
        for(int i = 0; i < x.length; i ++)
            d += (x[i] - y[i]) * (x[i] - y[i]);
        d = Math.sqrt(d);
        System.out.println(d);
    }
    
    public static void min(int[] x, int[] y){
        double d = 0;
        for(int i = 0; i < x.length; i ++){
            double dif = Math.abs(x[i] - y[i]);
            d += dif * dif * dif;
        }
        d = Math.pow(d, 1.0 / 3) ;
        System.out.println(d);
    }
    
    public static void che(int[] x, int[] y){
        double max = 0;
        for(int i = 0; i < x.length; i ++){
            double dif = Math.abs(x[i] - y[i]);
            if(dif > max)
                max = dif;
        }
        System.out.println(max);
    }
}
