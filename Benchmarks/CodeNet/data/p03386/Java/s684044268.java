import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            TreeSet<Integer> set = new TreeSet<>();
            for (int i = A; i < A + K; i++) {
                set.add(i);
            }
            for (int i = B - (K - 1); i <= B; i++) {
                set.add(i);
            }

            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}
