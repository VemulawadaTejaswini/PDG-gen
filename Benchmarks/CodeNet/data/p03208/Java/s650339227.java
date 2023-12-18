import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        int min = -1;
        int sum =0;
        for (int i =0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        for (int i =0; i<N-K+1; i++) {
            int diff = h[i+K-1] - h[i];
            if (diff < min || min < 0) {
                min = diff;
            }
        }

        System.out.println(min);
    }

}