import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Map<String, Integer> m = new HashMap<String, Integer>();
        int[] d = {-2, -1, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) for (int k = 0; k < 3; k++) {
                int ny = a[i] + d[j], nx = b[i] + d[k];
                if (ny <= 0 || ny + 2 > h || nx <= 0 || nx + 2 > w) continue;
                String key = Integer.toString(ny) + "," + Integer.toString(nx);
                m.put(key, m.getOrDefault(key, 0) + 1);
            }
        }
        long[] cnt = new long[10];
        for (String key : m.keySet()) {
            cnt[m.get(key)]++;
        }
        System.out.println(((long)(h - 2)) * (w - 2) - m.size());
        for (int i = 1; i <= 9; i++) {
            System.out.println(cnt[i]);
        }
    }
}