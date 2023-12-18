import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer l = sc.nextInt();
        Integer r = sc.nextInt();
        Integer dif = r - l;
        Integer mod = new Integer(2019);
        Integer s = l % mod;
        if(dif >= 2019) {
            System.out.println(0);
        } else {
            int ans = 1000000000;
            for(int i = 1; i <= dif; ++i) {
                ans = Math.min((l * (l + i)) % mod,ans);
            }
            System.out.println(ans);
        }
    }

}