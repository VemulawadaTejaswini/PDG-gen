import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt();
        List<Integer> divisors = commonDivisors(A, B);
        System.out.println(choseDivisors(divisors));
    }

    public static int choseDivisors(List<Integer> divisors) {
        int res = 0;
        for (int i = 1; i < divisors.size(); i++) {
            if (divisors.get(i) == 0) continue;
            for (int j = i + 1; j < divisors.size();j++) {
                if (divisors.get(j) == 0) continue;
                if (divisors.get(j) % divisors.get(i) == 0) {
                    divisors.set(j, 0);
                    res++;
                }
            }
        }
        return divisors.size() - res;
    }

    public static List<Integer> commonDivisors(int a, int b) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i < Math.min(a, b); i++)
            if (a % i == 0 && b % i == 0) res.add(i);
        return res;
    }
}
