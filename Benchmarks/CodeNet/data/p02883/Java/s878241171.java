import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] f = new long[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) f[i] = sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(f);

        long tmp = 0;
        for (int i=0; i<n; i++){
            tmp = Math.max(tmp, a[i]*f[n-1-i]);
        }

        long l = 0;
        long r = tmp;

        while (l<r){
            long mid = (l+r)/2;
            long cnt = 0;
            for (int i=0; i<n; i++){
                if (a[i]*f[n-1-i]>mid){
                    cnt += a[i] - mid/f[n-1-i];
                }
            }
            if (cnt<=k){
                r = mid;
            }else {
                l = mid+1;
            }
        }
        System.out.println(r);


    }
}