import java.io.*;
import java.util.*;

public class Main {

    public static ArrayList<Long> r;
    public static ArrayList<Long> g;
    public static ArrayList<Long> b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        char[] s = str.toCharArray();
        r = new ArrayList<>();
        g = new ArrayList<>();
        b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'R') {
                r.add((long)i);
            }
            if (s[i] == 'G') {
                g.add((long)i);
            }
            if (s[i] == 'B') {
                b.add((long)i);
            }
        }
        long ans = 0;
        for (Long val1 : b) {
            for (Long val2 : r) {
                if (val2 > val1) {
                    ans += startG(val2) - startG(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contG((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        
        for (Long val1 : r) {
            for (Long val2 : b) {
                if (val2 > val1) {
                    ans += startG(val2) - startG(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contG((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        
        for (Long val1 : g) {
            for (Long val2 : r) {
                if (val2 > val1) {
                    ans += startB(val2) - startB(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contB((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        
        for (Long val1 : r) {
            for (Long val2 : g) {
                if (val2 > val1) {
                    ans += startB(val2) - startB(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contB((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        
        for (Long val1 : b) {
            for (Long val2 : g) {
                if (val2 > val1) {
                    ans += startR(val2) - startR(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contR((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        
        for (Long val1 : g) {
            for (Long val2 : b) {
                if (val2 > val1) {
                    ans += startR(val2) - startR(val1);
                    if ((val2 + val1) % 2 == 0) {
                        if (contR((val2 + val1) / 2)) {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int startB(Long n) {
        if (b.size() == 0) {
            return 0;
        }
        int right = b.size();
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (b.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (b.get(left) > n) {
            return left;
        }
//        if (b.get(right) >= n) {
//            return right + 1;
//        }
        return left + 1;
    }

    private static boolean contB(Long n) {
        if (b.size() == 0) {
            return false;
        }
        int right = b.size() - 1;
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (b.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (b.get(left).equals(n)) {
            return true;
        }
        return b.get(right).equals(n);
    }

    private static int startR(Long n) {
        if (r.size() == 0) {
            return 0;
        }
        int right = r.size();
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (r.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (r.get(left) > n) {
            return left;
        }
//        if (r.get(right) >= n) {
//            return right + 1;
//        }
        return left + 1;
    }

    private static boolean contR(Long n) {
        if (r.size() == 0) {
            return false;
        }
        int right = r.size() - 1;
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (r.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (r.get(left).equals(n)) {
            return true;
        }
        return r.get(right).equals(n);
    }

    private static int startG(Long n) {
        if (g.size() == 0) {
            return 0;
        }
        int right = g.size();
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (g.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (g.get(left) > n) {
            return left;
        }
//        if (g.get(right) >= n) {
//            return right + 1;
//        }
        return left + 1;
    }

    private static boolean contG(Long n) {
        if (g.size() == 0) {
            return false;
        }
        int right = g.size() - 1;
        int left = 0;
        while (right - left > 1) {
            int m = (right + left) / 2;
            if (g.get(m) >= n) {
                right = m;
            } else {
                left = m;
            }
        }
        if (g.get(left).equals(n)) {
            return true;
        }
        return g.get(right).equals(n);
    }
}
