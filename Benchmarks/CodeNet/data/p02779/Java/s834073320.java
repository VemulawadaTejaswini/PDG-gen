import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            StringBuilder result = new StringBuilder();

            List<Long> tmp = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                tmp.add(sc.nextLong());
            }

            result.append(new HashSet<Long>(tmp).size() == tmp.size() ? "YES" : "NO");

            System.out.println(result);
        }
    }
}