import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<Integer> table = new ArrayList<>();
        outer: for (int i = 2; i <= 400000; i++) {
            if (i % 7 != 1 && i % 7 != 6) continue;
            for (int j = 2; j * j <= i; j++) {
                if (j % 7 != 1 && j % 7 != 6) continue;
                if (i % j == 0) continue outer;
            }
            table.add(i);
        }

        while (true) {
            int n = in.nextInt();
            if (n == 1) break;
            out.print(n + ":");
            for (int num : table) {
                if (n % num == 0) {
                    out.print(" " + num);
                }
            }
            out.println();
        }
        out.flush();
    }
}

