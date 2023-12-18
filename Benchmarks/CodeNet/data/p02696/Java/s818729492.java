import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int max = -1;
        for (int x = 0;x <= N; x++) {
            int uhen = (A * x) / B;
            int sahen = A * (x / B);
            
            int result = uhen - sahen;
            if (max < result) {
                max = result;
            }
        }
        System.out.println(max);
    }
}