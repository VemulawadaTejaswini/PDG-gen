import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[][] a = new long[n][2];
        for(int i=0; i<n; i++){
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
        }
        quicksort(a, 0, n-1);
        long ans = 0;
        for(int i=0; i<n; i++){
            if(a[i][1] < m){
                ans += a[i][0] * a[i][1];
                m = m - a[i][1];
            }
            else{
                ans += a[i][0] * m;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void quicksort(long[][] A, int p, int r){
        if(p < r){
            int q = partition(A, p, r);
            quicksort(A, p, q-1);
            quicksort(A, q+1, r);
        }
    }

    public static int partition(long[][] A, int p, int r){
        long x = A[r][0];
        int i = p - 1;
        for(int j=p; j<r; j++){
            if(A[j][0] <= x){
                i = i + 1;
                long keep = A[i][0];
                A[i][0] = A[j][0];
                A[j][0] = keep;
                keep = A[i][1];
                A[i][1] = A[j][1];
                A[j][1] = keep;
            }
        }
        long keep = A[i+1][0];
        A[i+1][0] = A[r][0];
        A[r][0] = keep;
        keep = A[i+1][1];
        A[i+1][1] = A[r][1];
        A[r][1] = keep;
        return i + 1;
    }
}