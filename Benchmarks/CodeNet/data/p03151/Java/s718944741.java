import java.util.*;
class Main
{
    static int[][] c;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        int[] dif = new int[n];
        long suma = 0, sumb = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            suma += a[i];
        } 
        long D = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            sumb += b[i];
            dif[i] = a[i] - b[i];
            if(dif[i] >= 0) cnt1++;
            else D -= dif[i];
        }
        if(suma < sumb){
            System.out.println(-1);
            return;
        }
        Arrays.sort(dif);
        long x = 0;
        int k = n-1;
        while(x < D){
            x += dif[k];
            cnt2++;
            k--;
        }
        System.out.println((n - cnt1 + cnt2));
    }
}   