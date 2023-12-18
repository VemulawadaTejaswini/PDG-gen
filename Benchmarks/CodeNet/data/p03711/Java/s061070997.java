import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> aa = Arrays.asList(new Int[]{a, b})

        List<Integer> c = Arrays.asList(new Int[]{1, 3, 5, 7, 8, 10, 12});
        List<Integer> d = Arrays.asList(new Int[]{2});
        List<Integer> e = Arrays.asList(new Int[]{4, 6, 9, 11});

        if (c.containsAll(aa) || d.containsAll(aa) || e.containsAll(aa)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}