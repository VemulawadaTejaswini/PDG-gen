import java.util.*;
import java.lang.*;

public class Main {
    static long difference(long a, long b, long c){
        long max = Math.max(a,Math.max(b,c));
        long min = Math.min(a,Math.min(b,c));
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        int ans = 0;

        for(int m=1; m<=M; m++) for(int d=1; d<=D; d++){
            int d1 = d%10, d10 = d/10;
            if(d1 >= 2 && d10 >= 2 && d1*d10==m) ans++;
        }
        System.out.println(ans);
    }
}
