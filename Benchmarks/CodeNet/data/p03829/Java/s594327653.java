import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        //AtCoder Beginner Contest 052
        //d
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double[] twn = new double[n];
        double[] dist = new double[n];
        double ans =  0;
        for(int i = 0; i < n; i++){
            twn[i] = Double.parseDouble(sc.next());
        }
        for(int i = 0; i < n-1; i++){
            dist[i] = Math.min((twn[i+1]-twn[i])*a, b);
        }
        for(int i = 0; i < n-1; i++){
            ans +=dist[i];
        }
        System.out.println((int)ans);
    }
}