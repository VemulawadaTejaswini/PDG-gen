import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = 0; i < 10000; i++) {
            if (Math.floor(i * 0.08) == A && Math.floor(i * 0.1) == B) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
