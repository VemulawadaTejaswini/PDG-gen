import java.util.*;

public class Main {

    static int mod = 2019;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long lmod = l % mod;
        long diff = r - l;
        if(2019 <= lmod + diff) System.out.println(0);
        else{
            long ans = 2019;
            for (int i = 0; i <= diff; i++) {
                for (int j = i+1; j <= diff; j++) {
                    ans = Math.min(ans, (lmod + i) * (lmod + j + 1) % mod);
                }
            }
            System.out.println(ans);
        }
        sc.close();

    }

}
