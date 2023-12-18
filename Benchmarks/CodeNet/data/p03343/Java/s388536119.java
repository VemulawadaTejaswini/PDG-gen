import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        int[][] sa = new int[n][2];
        boolean[] use = new boolean[n];
        Arrays.fill(use, false);        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int minpos = 0;
            for(int j=0; j<n; j++){
                if(a[j] < min && !use[j]){
                    min = a[j];
                    minpos = j;
                }
                sa[i][0] = min;
                sa[i][1] = minpos;
                use[minpos] = true;
            }
        }

        int ans = sa[q-1][0] - sa[0][0];

        Arrays.fill(use, false);        
        for(int i=n-1; i>=q; i--){
            
            for(int j=0; j<=i; j++){
                use[sa[j][1]] = true;
                if(check(use, k, q)){
                    int xy = sa[i][0] - sa[j+1][0];
                    if(xy < ans) ans = xy;
                }else{
                    use[sa[j][1]] = false;
                    break;
                }
            }
            use[sa[i][1]] = true;
        }

        
        System.out.println(ans);
    }

    public static boolean check(boolean[] use, int k, int q){
        int n = use.length;
        int pos = 0;
        int num = 0;
        for(int i=0; i<n; i++){
            if(use[i]){
                if(i - pos - 1>= k) num += i-pos-k;
                pos = i;
            }
        }
        if(n-1-pos-1>=k)num+=n-1-pos-k;
        if(num > q){
            return true;
        }else{
            return false;
        }
    }
}