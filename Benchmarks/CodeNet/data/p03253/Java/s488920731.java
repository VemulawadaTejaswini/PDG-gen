import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final int MODULUS = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(solve(N, M));

        sc.close();
    }

    static int solve(int N, int M) {
        List<Integer> divisors = buildDivisors(M);
        // System.out.println("divisors: " + divisors);
        // System.out.println("size: " + divisors.size());

        Map<Integer, Integer> productToWayNum = new HashMap<>();
        productToWayNum.put(1, 1);
        for (int i = 0; i < N; ++i) {
            Map<Integer, Integer> nextProductToWayNum = new HashMap<>();
            for (int product : productToWayNum.keySet()) {
                for (int divisor : divisors) {
                    if ((long) product * divisor > M) {
                        break;
                    }

                    int nextProduct = product * divisor;
                    nextProductToWayNum.put(nextProduct,
                            nextProductToWayNum.getOrDefault(nextProduct, 0) + productToWayNum.get(product));
                }
            }

            productToWayNum = nextProductToWayNum;
        }

        return productToWayNum.get(M);
    }

    static List<Integer> buildDivisors(int M) {
        List<Term> terms = new ArrayList<>();
        int current = M;
        for (int i = 2; i * i <= current; ++i) {
            int exponent = 0;
            while (current % i == 0) {
                ++exponent;
                current /= i;
            }

            if (exponent != 0) {
                terms.add(new Term(i, exponent));
            }
        }
        if (current != 1) {
            terms.add(new Term(current, 1));
        }

        List<Integer> divisors = new ArrayList<>();
        search(divisors, terms, 0, 1);
        Collections.sort(divisors);

        return divisors;
    }

    static void search(List<Integer> divisors, List<Term> terms, int index, int divisor) {
        if (index == terms.size()) {
            divisors.add(divisor);

            return;
        }

        Term term = terms.get(index);
        for (int i = 0; i <= term.exponent; ++i) {
            search(divisors, terms, index + 1, divisor);
            divisor *= term.primeFactor;
        }
    }
}

class Term {
    int primeFactor;
    int exponent;

    Term(int primeFactor, int exponent) {
        this.primeFactor = primeFactor;
        this.exponent = exponent;
    }
}