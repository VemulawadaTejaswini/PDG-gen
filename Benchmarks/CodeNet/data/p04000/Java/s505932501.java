import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 3);
        long h = Integer.parseInt(first[0]);
        long w = Integer.parseInt(first[1]);
        int n = Integer.parseInt(first[2]);
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ", 2);
            int hh = Integer.parseInt(line[0]) - 1;
            int ww = Integer.parseInt(line[1]) - 1;
            for (int a = Math.max(hh - 2, 0); a <= hh && a + 2 < h; a++) {
                for (int b = Math.max(ww - 2, 0); b <= ww && b + 2 < w; b++) {
                    long key = a * w + b;
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 1);
                    } else {
                        map.put(key, 1);
                    }
                }
            }
        }
        long[] ans = new long[10];
        for (int x : map.values()) {
            ans[x]++;
        }
        ans[0] = (long)(h - 2) * (w - 2) - map.size();
        StringBuilder sb = new StringBuilder();
        for (long x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
}