import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long V = sc.nextLong();
        final long B = sc.nextLong();
        final long W = sc.nextLong();
        final long T = sc.nextLong();

        HashMap<Long, Boolean> map = new HashMap<>();

        for (int i = 1; i <= T; i++) {
            if (A+V*i == B+W*i) {
                System.out.println("YES");
                return;
            }

            if (map.containsKey(B+W*i) && map.get(B+W*i)) {
                System.out.println("YES");
                return;
            }

            map.put(A+V*i, true);
        }

        System.out.println("NO");
    }
}
