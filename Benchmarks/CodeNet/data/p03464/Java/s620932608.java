import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long[] a = new long[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        long min = 2;
        long max = 2;
        boolean able = true;
        for (int i = k-1; i >= 0; i--) {
            long r = (min + a[i] -1) / a[i];
            min = a[i] * r;
            if(max < min){
                able = false;
                break;
            }
            r = max / a[i];
            max = a[i] * r + a[i] - 1;
        }
        System.out.println(able ? min + " " + max : -1);
        sc.close();

    }

}
