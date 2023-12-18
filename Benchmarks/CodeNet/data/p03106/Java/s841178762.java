import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, K;

        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        K = scanner.nextInt();

        List<Integer> canditates = factoring(A, B);

        System.out.println(canditates.get(K - 1));


    }

    static  List<Integer> factoring(int a, int b) {
        List<Integer> factorList = new ArrayList<Integer>();
        int gcd = getGCD(a, b);

        for (int ite = 1; ite <= gcd; ite++) {
            if (gcd%ite == 0) {
                factorList.add(ite);
            }
        }
        return factorList;
    }

    private static int getGCD(int a, int b) {
        int canditate = 0;

        if (a < b) {
            return getGCD(b, a);
        }

        canditate = b % a;

        if (canditate == 0 ) {
            return  a;
        } else {
            while (b % a != 0) {
                canditate = b % a;
                b = a;
                a = canditate;
            }
            return canditate;
        }
    }
}
