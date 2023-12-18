import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long[] a = new long[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        for(int i = 0; i < n; i++){
            int j = i, lcnt = 0, rcnt = 0;
            while(j >= 0 && a[j] >= a[i]){
                lcnt++;
                j--;
            }
            j = i;
            while(j < n && a[i] <= a[j]){
                rcnt++;
                j++;
            }
            ans += lcnt * rcnt * a[i];
        }
        System.out.println(ans);
    }
}