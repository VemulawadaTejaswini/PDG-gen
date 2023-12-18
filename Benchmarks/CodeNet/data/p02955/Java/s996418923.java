import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int sum = 0;
        for (int i=0; i<n; i++) sum += a[i];
        int max = 0;
        for (int d=1; d*d<=sum; d++){
            if (sum%d==0){
                if (check(a, n, k, d)){
                    max = (int)Math.max(max, d);
                }
                if (check(a, n, k, sum/d)){
                    max = (int)Math.max(max, sum/d);
                }
            }
        }
        System.out.print(max);
    }

    static boolean check(int arr[], int n, int k, int d){
        int newarr[] = new int[n];
        for (int i=0; i<n; i++) newarr[i] = arr[i] % d;
        Arrays.sort(newarr);

        int a = 0;
        int b = n-1;
        while(a<n && newarr[a]==0) a++;
        int c = 0;
        while(b>a){
            c += newarr[a];
            k -= newarr[a];
            while(newarr[b] +c >= d && b>a){
                c -= (d - newarr[b]);
                b--;
            }
            a++;
        }
        return k>=0;
    }
}