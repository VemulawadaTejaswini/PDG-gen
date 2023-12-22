import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int D = s.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if (Math.sqrt(x * x + y * y) <= D) count++;
        }
        System.out.println(count);
    }
}