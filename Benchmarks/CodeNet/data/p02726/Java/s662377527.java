import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < n; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int length = calcLength(i, j, x, y);
                map.put(length, map.get(length) + 1);
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(map.get(i));
        }
    }

    private static int calcLength(int i, int j, int x, int y) {
        int a = j - i;
        int b = Math.abs(x - i) + 1 + Math.abs(j - y);
        return Math.min(a,b );
    }
}
