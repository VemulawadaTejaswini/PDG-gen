import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextLong(), w = in.nextLong();
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int[] dx = {0, 0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {0, -1, -1, 0, 1, 1, 1, 0, -1};
        for(int i = 0; i < n; i++) {
            int a = in.nextInt() - 1, b = in.nextInt() - 1;
            for(int k = 0; k < 9; k++) {
                int y = a + dy[k], x = b + dx[k];
                if(x < 1 || w-1 <= x || y < 1 || h-1 <= y) {
                    continue;
                }
                String str = new StringBuilder().append(y).append(' ').append(x).toString();
                Integer val = map.get(str);
                map.put(str, val == null ? 1 : val + 1);
            }
        }
        System.out.println((h-2) * (w-2) - map.size());
        print(1, map);
    }

    public static void print(final int val, Map<String, Integer> map) {
        if(val == 10) return;
        System.out.println(map.keySet().stream()
                .mapToInt(key -> map.get(key))
                .filter(v -> v == val)
                .count());
        print(val + 1, map);
        
    }
}