import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long count = 0;
        Integer[] H = new Integer[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        Arrays.sort(H, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            if (K == 0) {
                count += H[i];
            } else {
                K--;
            }
        }
        System.out.println(count);
    }
}