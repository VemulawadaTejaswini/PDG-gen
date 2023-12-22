import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
        }
        Arrays.sort(Az);
        int sum = 0;
        for (int i = N - 1; i > 0; i--) {
            sum += Az[i];
        }
        System.out.println(sum);

    }
}
