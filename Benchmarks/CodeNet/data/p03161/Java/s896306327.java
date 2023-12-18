import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        int[] a = new int[n];
        a[0] = 0; a[1] = Math.abs(h[1] - h[0]);
        for(int i = 2; i < n; i++){
            a[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= Math.min(i , k); j++){
                a[i] = Math.min(a[i], a[i-j] + Math.abs(h[i] - h[i - j]));
            }
        }
        System.out.println(a[n-1]);
    }
}