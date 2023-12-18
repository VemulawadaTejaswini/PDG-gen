import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();
        for(int i = 0; i < n; i++) c[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int[] cntA = new int[n], cntC = new int[n];
        cntA[0] = cntC[0] = 0;
        while(cntA[0] < n &&a[cntA[0]] < b[0])
            cntA[0]++;
        int k = n-1;
        while(c[k] > b[0]){
            cntC[0]++;
            k--;
            if(k < 0) break;
        }
        for(int i = 1; i < n; i++){
            cntA[i] = cntA[i-1];
            while(cntA[i] < n && a[cntA[i]] < b[i]){
                cntA[i]++;
            }
            k = cntC[i] = cntC[i-1];
            while(k > 0 && k <= n && c[n - k] <= b[i]){
                cntC[i]--;
                k--;
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++)
            ans += cntA[i] * cntC[i];
        System.out.println(ans);
    }
}