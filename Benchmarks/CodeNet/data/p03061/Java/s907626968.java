import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        int[] r = new int[n];
        int max = 0;
        for(int i = 1; i < n; i++) {
            l[i] = gcd(l[i-1], a[i-1]);
        }
        for(int i = n-2; i >=0; i--) {
            r[i] = gcd(r[i+1], a[i+1]);
        }
        for(int i = 0; i < n; i++) {
            max = Math.max(max, gcd(l[i], r[i]));
        }
        System.out.println(max);
    }

    private static int gcd(int a, int b) {
        if(a < b) return gcd(b, a);
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}