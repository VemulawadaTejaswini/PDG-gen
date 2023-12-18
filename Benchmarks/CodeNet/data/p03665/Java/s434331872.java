import java.math.BigDecimal;
import java.util.*;

public class Math {

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
        BigDecimal ans = new BigDecimal(0);
        for (int i = p; i <= o; i+=2) {
            for (int j = 0; j <= e; j++) {
                BigDecimal t = new BigDecimal(1).multiply(comb(o, i)).multiply(comb(e, j));
                ans = ans.add(t);
            }
        }
        System.out.println(ans);
        sc.close();

    }

    private static BigDecimal comb(int n, int r){
        BigDecimal ret = new BigDecimal(1);
        for (int i = 0; i < Math.min(r, n-r); i++) {
            ret = ret.multiply(new BigDecimal(n-i));
        }
        for (int i = 1; i <= Math.min(r, n-r); i++) {
            ret = ret.divide(new BigDecimal(i));
        }
        return ret;
    }

}

