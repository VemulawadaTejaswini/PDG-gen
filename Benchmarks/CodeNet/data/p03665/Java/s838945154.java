import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int o = 0, e = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x % 2 == 0){
                e++;
            }else{
                o++;
            }
        }
        long ans = 0;
        for (int i = p; i <= o; i+=2) {
            for (int j = 0; j <= e; j++) {
                ans += comb(o, i) * comb(e, j);
            }
        }
        System.out.println(ans);
        sc.close();

    }

    private static long comb(int n, int r){
        long ret = 1L;
        for (int i = 0; i < Math.min(r, n-r); i++) {
            ret *= (long)n-i;
        }
        for (int i = 1; i <= Math.min(r, n-r); i++) {
            ret /= (long)i;
        }
        return ret;
    }

}

