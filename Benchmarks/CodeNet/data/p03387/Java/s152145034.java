import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; ++i) {
            ABC[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(ABC);

        int f = ABC[2] - ABC[0];
        int s = ABC[2] - ABC[1];
        int ans = 0;
        if ((ABC[0] + ABC[1] + ABC[2]) % 2 == ABC[2] % 2) {
            if (s <= ABC[0]) {
                ans = s + (f - s) / 2 + (f - s) % 2;
            } else {
                ans = f / 2 + s / 2 + f % 2;
            }
        } else {
            ++f;
            ++s;
            if (s <= ABC[0]) {
                ans = s + (f - s) / 2 + (f - s) % 2;
            } else {
                ans = f / 2 + s / 2 + f % 2;
            }
        }

        System.out.println(ans);
    }
}