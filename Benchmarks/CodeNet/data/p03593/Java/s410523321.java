import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[] histgram = new int[26];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            char[] list = s.toCharArray();
            for (int j = 0; j < W; j++) {
                histgram[list[j]-'a'] += 1;
            }
        }
        int count_quad = 0;
        int count_not_quad = 0;
        int[] count = new int[4];
        for (int i = 0; i < 26; i++) {
            count[histgram[i] % 4] += 1;
        }
        if (H % 2 == 0 && W % 2 == 0) {
            if (count[1] == 0 && count[2] == 0 && count[3] == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }
        if (H % 2 == 1 && W % 2 == 0) {
            if (0 < count[1]) {
                System.out.println("No");
                return;
            }
            if (W / 2 < count[2]) {
                System.out.println("No");
                return;
            }
            if (0 < count[3]) {
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
            return;
        }
        if (W % 2 == 1 && H % 2 == 0) {
            if (0 < count[1]) {
                System.out.println("No");
                return;
            }
            if (H / 2 < count[2]) {
                System.out.println("No");
                return;
            }
            if (0 < count[3]) {
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
            return;
        }
        if (1 < count[1]) {
            System.out.println("No");
            return;
        }
        if (1 < count[3]) {
            System.out.println("No");
            return;
        }
        if (count[1] == 1 && count[3] == 1) {
            System.out.println("No");
            return;
        }
        if ((H - 1) / 2 + (W - 1) / 2 < count[2] + count[3]) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        return;
    }
}
