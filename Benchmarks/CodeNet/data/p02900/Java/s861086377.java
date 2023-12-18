import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(list.get(0));
        parent : for (int i = 1; i < list.size() ; i++) {
            long p = list.get(i);
            for (Long an : ans) {
                if (gcd(p, an) != 1) {
                    continue parent;
                }
            }
            ans.add(p);
        }

        System.out.println(ans.size());
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
