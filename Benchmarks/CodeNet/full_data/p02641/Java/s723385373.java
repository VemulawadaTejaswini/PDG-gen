import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = nextInt(scanner);
        int n = nextInt(scanner);
        List<Integer> p = new  ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(nextInt(scanner));
        }
        int i = 0;
        if (!p.contains(x)) {
            System.out.println(x);
            return;
        }
        while (true) {
            if (!p.contains(x - i)) {
                System.out.println(x - 1);
                return;
            }
            if (!p.contains(x + i)) {
                System.out.println(x + i);
                return;
            }
            i++;
        }
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}



