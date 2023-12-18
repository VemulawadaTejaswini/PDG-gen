import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFiveFiveEverywhere solver = new DFiveFiveEverywhere();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFiveFiveEverywhere {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            ArrayList<Integer> prime = Prime.eratosthenesSieve(55555);
            int n = in.nextInt();
            prime.removeIf(i -> i % 5 != 1);
            for (int i = 0; i < n; i++) {
                out.print(prime.get(i));
                out.print(" ");
            }
            out.println();
        }

    }

    static class Prime {
        public static ArrayList<Integer> eratosthenesSieve(int n) {
            // n 以下の素数を列挙する, O(N*log(log N))
            ArrayList<Integer> prime = new ArrayList<>();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                nums.add(i);
            }
            while (nums.get(0) <= Math.sqrt(n)) {
                int nxtPrime = nums.get(0);
                prime.add(nxtPrime);
                nums.removeIf(x -> (x % nxtPrime == 0));
            }
            prime.addAll(nums);
            return prime;
        }

    }
}

