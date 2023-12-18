import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt() , h = s.nextInt();
        int a = -1;
        int [] b = new int[n];
        for(int i = 0; i < n; ++i) {
            int x = s.nextInt();
            a = Math.max(a, x);
            b[i] = s.nextInt();
        }
        Arrays.sort(b);
        long cnt = 0;
        int lst = n - 1;
        while(h > 0 && lst >= 0 && b[lst] >= a) {
            h -= b[lst --];
            cnt ++;
        }
        cnt += (Math.max(h,0)+ a - 1) / a;
        System.out.println(cnt);

    }
}
