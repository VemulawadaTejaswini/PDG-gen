import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet =  new HashSet<>();
        hashSet.add(sc.nextInt());
        hashSet.add(sc.nextInt());
        hashSet.add(sc.nextInt());
        System.out.println(hashSet.size());
    }

    private static double cal(final int n) {
        double res = 0;
        double resm1 = 1;
        double ressum2 = 1;
        for (int i = 3; i < n + 1; i++) {
            res = 1.0 + 2.0 / i * ressum2;
            ressum2 += resm1;
            resm1 = res;
        }
        return res;
    }
}
