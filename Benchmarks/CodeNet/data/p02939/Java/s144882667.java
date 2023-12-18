import java.util.BitSet;
import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        String s = sc.next();
        BitSet bits = new BitSet(s.length());
        for (int i = 1; i < s.length(); i++) {
            bits.set(i, s.charAt(i) != s.charAt(i - 1));
        }

        int sum = 1;
        int prev = 0;
        boolean set = false;
        while (true){
            int next = set ? bits.nextClearBit(prev) : bits.nextSetBit(prev);
            if (next < 0){
                sum += s.length() - prev + (set ? 0 : -1);
                break;
            }
            int count = next - prev + (set ? 0 : -1);
            prev = next;
            set = !set;
            sum += count;
        }

        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}