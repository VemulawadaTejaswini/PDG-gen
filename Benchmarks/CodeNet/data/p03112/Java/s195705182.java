import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        long[] s = new long[a];
        long[] t = new long[b];

        for(int i=0; i<a; i++) {
            s[i] = sc.nextLong();
        }
        for(int i=0; i<b; i++) {
            t[i] = sc.nextLong();
        }

        for(int i=0; i<q; i++) {
            long p = sc.nextLong();
            int si = - Arrays.binarySearch(s, p) - 1;
            int ti = - Arrays.binarySearch(t, p) - 1;
            long min = Long.MAX_VALUE;

            if(si>0 && ti>0) {
                min = Math.min(min, Math.max(p-s[si-1], p-t[ti-1]));
            }
            if(si>0 && ti<b) {
                min = Math.min(min, p-s[si-1] + t[ti]-p + Math.min(p-s[si-1], t[ti]-p));
            }
            if(si<a && ti<b) {
                min = Math.min(min, s[si]-p + t[ti]-p  + Math.min(s[si]-p, t[ti]-p));
            }
            if(si<a && ti>0) {
                min = Math.min(min, Math.max(s[si]-p, p-t[ti-1]));
            }
            System.out.println(min);
        }

    }

}
