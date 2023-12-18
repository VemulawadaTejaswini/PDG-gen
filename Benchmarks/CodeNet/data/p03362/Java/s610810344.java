import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Main {

    public static List<Integer> sieveOfEratosthenes(int n) {
        if (n < 2) {
            return new ArrayList<>();
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int p = 2; p <= sqrt; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = sieveOfEratosthenes(55555);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> ans = new ArrayList<>();
        ans.add(2);
        ans.add(3);
        ans.add(5);
        ans.add(7);
        ans.add(11);
        for (int i = 5; i < list.size(); i++) {
            boolean found = true;
            for (int j = 0; j < ans.size(); j++) {
                if (set.contains(list.get(i) + ans.get(j))) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans.add(list.get(i));
                if (ans.size() == n) {
                    break;
                }
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(ans.get(i)));
        }
        System.out.println(sj);
    }

}
