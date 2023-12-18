import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int l = lcm(n, m);
        Map<Integer, String> sMap = new HashMap<>();
        Map<Integer, String> tMap = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            sMap.put(i + l / n, s.substring(i, i + 1));
        }
        for (int i = 0 ; i < m ; i++) {
            tMap.put(i + l / m, t.substring(i, i + 1));
        }

        for (int i = 0 ; i < n ; i++) {
            if (sMap.containsKey(i) && tMap.containsKey(i)) {
                if (!sMap.get(i).equals(tMap.get(i))) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(l);

    }
    static int gcd(int m , int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    static int lcm(int n , int m) {
        return n * m / gcd(n, m);
    }

}