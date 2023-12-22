import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,C,S,L,h,d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        C = sc.nextDouble();
        d = Math.sqrt((a * a) + (b * b) -2 * a * b * Math.cos(Math.toRadians(C)));
        S = (a * b * Math.sin(Math.toRadians(C))) / 2.0;
        L = a + b + d;
        h = (S * 2.0) / a; 
        System.out.printf("%.10f\n",S);
        System.out.printf("%.10f\n",L);
        System.out.printf("%.10f\n",h);
        
    }
}
