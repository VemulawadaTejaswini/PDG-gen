import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lcm = (int) lcm(n, m);
        Map<Integer, Character> map = new HashMap<>();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        int dn = lcm/n;
        int dm = lcm/m;
        for(int i=0; i<n; i++) {
            map.put(i*dn, s[i]);
        }
        for(int i=0; i<m; i++) {
            if(map.containsKey(i*dm)) {
                if(map.get(i*dm).charValue() != t[i]) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(lcm);

    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

}
