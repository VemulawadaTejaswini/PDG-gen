import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int[] h = new int[N];
        double min = 10000000.0;
        int idx = 0;
        double t = 0.0;
        double dif = 0.0;
        for(int i=0; i<N; i++) {
            h[i] = Integer.parseInt(sc.next());
            t = (double)T - h[i]*0.006;
            if(t >= A) dif = t - A;
            else dif = A - t;
            if(min > dif) {
                min = dif;
                idx = i;
            }
        }
        System.out.println(idx+1);
    }
    
}