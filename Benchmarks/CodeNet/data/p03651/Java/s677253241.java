import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static BigInteger dp[][] = new BigInteger[901][901];

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        PriorityQueue<Integer> set = new PriorityQueue<>(N, Integer::compareTo);
        for (int i :IntStream.range(0, N).toArray()){
            int tmp = scan.nextInt();
            if (tmp == K) {
                System.out.println("POSSIBLE");
                return;
            }
            set.add(tmp);
        }
        List<Integer> A = new ArrayList<>();
        while (!set.isEmpty()) {
            A.add(set.poll());
        }
        if(A.get(A.size() - 1) < K) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        int min = A.get(0);
        if(min == 1) {
            System.out.println("POSSIBLE");
            return;
        }

        for (int i :IntStream.range(1, N).toArray()){
            if (f(A.get(i), min) != 0) {
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    static int f(int x, int y) {
        int tmp = x % y;
        if (tmp == 0) {
            return 0;
        }
        if (tmp == 1) {
            return 1;
        }
        return f(y, tmp);
    }

}
