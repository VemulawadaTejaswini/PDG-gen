import java.util.*;

public class Main {

    static int mod = 2019;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long lmod = l % mod;
        long rmod = r % mod;
        if(rmod < lmod) System.out.println(0);
        else System.out.println(lmod * (lmod + 1));
        sc.close();

    }

}
