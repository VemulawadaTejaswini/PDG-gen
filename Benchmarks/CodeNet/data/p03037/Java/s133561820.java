
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Pair> list = new ArrayList<>();
        for (int i=0; i < M; i++) {
            list.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }

        Set<Integer> ngSet = new HashSet<>();
        for (Pair pair : list) {
            for (int i=1; i <= N; i++) {
                if (i < pair.left || i > pair.right) {
                    ngSet.add(i);
                }
            }
        }

        System.out.println(N - ngSet.size());
    }

    static class Pair {
        int left;
        int right;
        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}