import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static final void main(String[] args) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            char[] in = sc.next().toCharArray();
            for (int j = 0; j < W; j++) {
                char ch = in[j];
                if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
                else map.put(ch, 1);
            }
        }
        if (W % 2 == 0 && H % 2 == 0) {
            for (int v : map.values()) {
                if (v % 4 != 0) NO();
            }
        }
        else if (W % 2 == 0 || H % 2 == 0) {
            int b = 0;
            for (int v : map.values()) {
                if (v % 2 == 1) {
                    NO();
                }
                b += v % 4 / 2;
            }
            int c = W % 2 == 0 ? W / 2 : H / 2;
            if (b > c) NO();
        }
        else {
            int a = 0;
            int b = 0;
            for (int v : map.values()) {
                if (v % 2 == 1) {
                    a++;
                    b += (a - 1) % 4;
                }
                else {
                    b += a % 4 / 2;
                }
            }
            if (a != 1 && b > (W  - 1) / 2 + (H - 1) / 2) {
                NO();
            }
        }
        YES();
    }

    static void YES() {
        System.out.println("Yes");
        System.exit(0);
    }

    static void NO() {
        System.out.println("No");
        System.exit(0);
    }
}