import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "9999 1\n" +
            "0";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        int[] split = splitInt(scanner.nextLine());
        int N = split[0];
        int K = split[1];
        int[] DInt = splitInt(scanner.nextLine());
        char[] D = new char[DInt.length];
        for (int i = 0; i < K; i ++) {
            D[i] = String.valueOf(DInt[i]).toCharArray()[0];
        }

        while (! acceptable(N, D)) N ++;

        System.out.println(N);
    }

    private boolean acceptable(int N, char[] D) {
        char[] chars = String.valueOf(N).toCharArray();

        for (char c: chars) {
            for (char d: D) {
                if (c == d) return false;
            }
        }

        return true;
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }
}
