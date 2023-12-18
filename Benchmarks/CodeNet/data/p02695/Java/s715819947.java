import java.util.*;

public class Main {

    static int n;
    static int m;
    static int q;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int max = 0;
    static int[] f;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        for(int i=0; i<q; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        f = new int[n];
        dfs(0, 1);
        System.out.println(max);
    }

    static void dfs(int p, int last) {
        if(p == n) {
            int sum = 0;
            for(int i=0; i<q; i++) {
                if(f[b[i]]-f[a[i]] == c[i]) {
                    sum += d[i];
                }
            }
            max = Math.max(max, sum);
            return;
        }
        for(int i=last; i<=m; i++) {
            f[p] = i;
            dfs(p+1, i);
        }
    }
}