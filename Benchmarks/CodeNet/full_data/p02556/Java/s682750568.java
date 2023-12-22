import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        long max = 0L;
        int tv = 0;
        long cx = x[0], cy = y[0];
        for (int i = 1; i < n; i++) {
            long tmp = Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
            if(max < tmp){
                tv = i;
                max = tmp;
            }
        }
        cx = x[tv]; cy = y[tv];
        for (int i = 0; i < n; i++) {
            long tmp = Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
            if(max < tmp){
                tv = i;
                max = tmp;
            }
        }
        System.out.println(max);
        sc.close();

    }

}
