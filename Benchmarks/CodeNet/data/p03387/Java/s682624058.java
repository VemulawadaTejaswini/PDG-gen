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

        boolean parity = (ABC[0] + ABC[1] + ABC[2]) % 2 == ABC[2] % 2;
        int tar = 0;
        if (parity) {
            tar = ABC[2];
        } else {
            tar = ABC[2] + 1;
        }

        int ans = 0;
        for (int i = 0; i < 3; ++i) {
            ans += tar - ABC[i];
        }

        System.out.println(ans / 2);
    }
}