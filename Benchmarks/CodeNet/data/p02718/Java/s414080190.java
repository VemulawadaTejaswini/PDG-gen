import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        Integer[] items = new Integer[N];
        for (int i = 0; i < N; i++) {
            int itemVote = sc.nextInt();
            sum += itemVote;
            items[i] = itemVote;
        }
        Arrays.sort(items, Collections.reverseOrder());
        double baseNum = sum / (4 * M);
        for (int l = 0; l < M; l++) {
            double val = (double) items[l];
            if (val < baseNum) {
                continue;
            }
            cnt++;
        }
        if (cnt >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
