import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ov = 0;
        int s = 0;
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            ov += d * d;
            s += d;
        }
        System.out.println((s * s - ov)/2);
    }
}
