import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] T = new int[n];
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        long t=1,a=1;
        for (int i = 0; i < n; i++) {
            long k = max(ceil(a, A[i]), ceil(t, T[i]));
            t = k*T[i];
            a = k*A[i];
           // out.println(k+" "+t+" "+a);
        }
        out.println(a+t);
    }
    static long ceil(long a,long b){
        return a%b==0?a/b:a/b+1;
    }
}