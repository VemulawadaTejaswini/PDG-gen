import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();

        Map<Integer, Integer> map = new HashMap<>();
        int num = 0;
        int pow = 1;
        int L = 0;
        map.put(L, 1);

        for (int i = N - 1; i >= 0; i--) {
            L += (Character.getNumericValue(S.charAt(i)) * pow) % 2019;
            L %= 2019;
            map.put(L, map.getOrDefault(L, 0) + 1);
            pow *= 10;
            pow %= 2019;
        }

        for (Object o : map.entrySet().stream().map(s -> s.getValue()).toArray()) {
            num += nCr((int) o, 2);
        }
        System.out.println(num);
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}