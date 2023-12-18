import java.io.PrintWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int length = in.nextInt();
            long re = in.nextInt();
            int[] ints = new int[length];

            for (int i = 0; i < length; i++) {
                ints[i] = in.nextInt();
            }

            long a = 0;
            long b = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (ints[i] <= ints[j]) continue;
                    a++;
                    if (j > i) b++;
                }
            }
            int mod = 1000000007;
            long counter = 0;
            counter += (b * re) % mod;
            counter += (a * 0.5 * ((re * (re - 1)) % mod)) % mod;

            out.println(counter % mod);
        }
    }
}