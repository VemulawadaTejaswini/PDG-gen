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
            if (!validate(map, (W & 1) == 0)) {
                NO();
            }
        }
        for (int j = 0; j < W; j++) {
            map.clear();
            for (int i = 0; i < H; i++) {
                char ch = c[i][j];
                if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
                else map.put(ch, 1);
            }
            if (!validate(map, (H & 1) == 0)) {
                NO();
            }
        }
        YES();
    }

    static boolean validate(HashMap<Character, Integer> map, boolean even) {
        int a = 0;
        if (even) {
            for (int v : map.values()) {
                if ((v & 1) == 1) {
                    return false;
                }
            }
        }
        else {
            for (int v : map.values()) {
                if ((v & 1) == 1) {
                    a++;
                }
            }
            if (a != 1) return false;
        }
        return true;
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