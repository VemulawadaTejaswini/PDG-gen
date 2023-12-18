import java.util.*;
class Main
{
    static long mod = 1000000007;
    static long[] p = new long[1000001];
    String yes = "Yes";
    String no = "No";
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        long ans = h[0];
        for(int i = 1; i < n; i++){
            ans += Math.max(0, h[i] - h[i-1]);
        }
        System.out.println(ans);
    }
}
