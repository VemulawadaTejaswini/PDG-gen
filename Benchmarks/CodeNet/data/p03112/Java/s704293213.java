import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt();
        long[] s = new long[a + 2], t = new long[b + 2], x = new long[w];
        s[0] = t[0] = -100000000;
        s[a+1] = t[b+1] = 100000000;
        s[0] *= 1000;
        t[0] = s[0];
        s[a+1] *= 1000;
        t[b+1] = s[a+1];
        for(int i = 1; i <= a; i++){
            s[i] = sc.nextLong();
        }
        for(int i = 1; i <= b; i++){
            t[i] = sc.nextLong();
        }
        for(int i = 0; i < w; i++){
            x[i] = sc.nextLong();
        }
        
        for(int i = 0; i < w; i++){
            int p = -Arrays.binarySearch(s, x[i]) - 1;
            int q = -Arrays.binarySearch(t, x[i]) - 1;
            long ans = Math.max(s[p] - x[i], t[q] - x[i]);
            ans = Math.min(ans, Math.max(x[i] - s[p-1] , t[q] - x[i]) + 2 * Math.min(x[i] - s[p-1] , t[q] - x[i]));
            ans = Math.min(ans, Math.max(x[i] - t[q-1] , s[p] - x[i]) + 2 * Math.min(x[i] - t[q-1] , s[p] - x[i]));
            ans = Math.min(ans, Math.max(x[i] - s[p-1], x[i] - t[q-1]));
            System.out.println(ans);
        }
    }
}
 