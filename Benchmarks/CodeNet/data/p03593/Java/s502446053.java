import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static final void main(String[] args) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H][];
        for (int i = 0; i < H; i++) c[i] = sc.next().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            map.clear();
            for (int j = 0; j < W; j++) {
                char ch = c[i][j];
                if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
                else map.put(ch, 1);
            }
            validate(map, (W & 1) == 0);
        }
        for (int j = 0; j < W; j++) {
            map.clear();
            for (int i = 0; i < H; i++) {
                char ch = c[i][j];
                if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
                else map.put(ch, 1);
            }
            validate(map, (H & 1) == 0);
        }
        YES();
    }

    static void validate(HashMap<Character, Integer> map, boolean even) {
        if (even) {
            for (int v : map.values()) {
                if ((v & 1) == 1) {
                    NO();
                }
            }
        }
        else {
            boolean b = false;
            for (int v : map.values()) {
                if ((v & 1) == 1) {
                    if (b) NO();
                    b = true;
                }
            }
            if (!b) NO();
        }
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