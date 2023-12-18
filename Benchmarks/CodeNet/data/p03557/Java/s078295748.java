import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int[] p = new int[n], q = new int[n];
        for(int i = 0; i < n; i++){
            int x = Arrays.binarySearch(c, b[i]);
            int y = Arrays.binarySearch(b, a[i]);
            p[i] = n - Math.abs(x + 1);
            q[i] = Math.abs(y + 1);
        }
        long[] sum = new long[n];
        sum[n-1] = p[n-1];
        for(int i = n-2; i >= 0; i--){
            sum[i] = sum[i+1] + p[i];
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(q[i] < n)
            ans += sum[q[i]];
        }
        System.out.println(ans);
    }
}