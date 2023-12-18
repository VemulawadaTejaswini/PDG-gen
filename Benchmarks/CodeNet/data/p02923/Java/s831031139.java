import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] h = new int[n];
        int[] cnt = new int[n];
        List<Integer> indexList = new ArrayList<>();

        int maxNum = 0;
        int maxCntIndex = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();

            for (int k = 0; k < indexList.size(); k++) {
                int index = indexList.get(k);
                if (h[index] >= h[i]) {
                    h[index] = h[i];
                    cnt[index]++;
                    if (cnt[index] > cnt[maxCntIndex])
                        maxCntIndex = index;
                }
                if (h[index] < h[maxCntIndex] && cnt[index] < cnt[maxCntIndex]) {
                    indexList.remove(k);
                    k--;
                }
            }
            if (maxNum < h[i]) {
                if (cnt[maxCntIndex] < n-i)
                    indexList.add(i);
                maxNum = h[i];
            }
        }

        System.out.println(cnt[maxCntIndex]);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}