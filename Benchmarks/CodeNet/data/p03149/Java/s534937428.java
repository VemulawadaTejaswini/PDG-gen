import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int[] ns = new int[4];
        for (int i = 0; i < 4; i++) {
            ns[i] = sc.nextInt();
        }
        Arrays.sort(ns);
        if (ns[0] == 1 && ns[1] == 4 && ns[2] == 7 && ns[3] == 9) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}
