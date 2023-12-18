import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            b[i] = a[i]-i-1;
            sum  += b[i];
        }
        int n = sum/N;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int[] c = new int[N];
        for(int i = 0; i < N; i++){
            c[i] = a[i]-i-1-n;
            if (c[i] < 0) {
                c[i] = -c[i];
            }else{}
            sum2 += c[i];
        }
        for(int i = 0; i < N; i++){
            c[i] = a[i]-i-1-n-1;
            if (c[i] < 0) {
                c[i] = -c[i];
            }else{}
            sum3 += c[i];
        }
        for(int i = 0; i < N; i++){
            c[i] = a[i]-i-1-n+1;
            if (c[i] < 0) {
                c[i] = -c[i];
            }else{}
            sum4 += c[i];
        }
        System.out.println(Math.min(Math.min(sum2, sum3), sum4));
    }
}