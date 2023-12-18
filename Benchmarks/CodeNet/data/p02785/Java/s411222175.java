import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Long[] H = new Long[N];
        for (int i = 0; i < N; i++){
            H[i] = sc.nextLong();
        }
        Arrays.sort(H, Collections.reverseOrder());
        for (int i = 0; i < K; i++){
            if (i == N) {
                break;
            }
            H[i] = (long)0;
        }
        long result = 0;
        for (int i = 0; i < N; i++){
            result += H[i];
        }
        System.out.println(result);
    }
}
