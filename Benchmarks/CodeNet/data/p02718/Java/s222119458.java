import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int items[] = new int[N];
        for (int i = 0; i < N; i ++) {
            items[i] = sc.nextInt();
        }
        int total = Arrays.stream(items).sum();
        int min = total / (4 * M);
        int cnt = Arrays.stream(items).filter(i -> i >= min).map(i -> 1).sum();
        if (cnt >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
