import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < K; i++) {
                int d = sc.nextInt();
                for (int j = 0; j < d; j++) {
                    set.add(sc.nextInt());
                }
            }
            System.out.println(N - set.size());
        }
    }
}
