import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        long res = a[n-1] - a[0];

        int li = 1;
        int ri = n-2;
        int min = a[0];
        int max = a[n-1];
        while(li <= ri) {
            if(Math.abs(max - a[li]) > Math.abs(a[ri] - min)) {
                res+=Math.abs(max-a[li]);
                int tmin = Math.min(min, a[li]);
                int tmax = Math.max(min, a[li]);
                min = tmin;
                max = tmax;
                li++;
            } else {
                res+=Math.abs(a[ri] - min);
                int tmin = Math.min(max, a[ri]);
                int tmax = Math.max(max, a[ri]);
                min = tmin;
                max = tmax;
                ri--;
            }
        }
        System.out.println(res);

    }

}
