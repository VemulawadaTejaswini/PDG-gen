import java.io.*;
import java.util.*;

public class Main {

    static final int M = 1046527;  // オープンアドレス法ではmが素数でないと生成できないハッシュが存在してしまう
    static String[] hashTable = new String[M];

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String order = sc.next();
            String str = sc.next();

            if (order.equals("insert")) {
                insert(str);
            } else if (order.equals("find")) {
                if (find(str)) {
                    pw.println("yes");
                } else {
                    pw.println("no");
                }
            }
        }

        pw.flush();
    }

    // 文字から数値に変換
    static int getChar(char ch) {
        if (ch == 'A') return 1;
        else if (ch == 'C') return 2;
        else if (ch == 'G') return 3;
        else if (ch == 'T') return 4;
        else return 0;
    }

    // 文字列から数値へ変換してkeyを生成する
    static int getKey(char[] str) {
        int sum = 0, p = 1;
        for (int i = 0; i < str.length; i++) {
            sum += p * getChar(str[i]);
            p *= 5;
        }
        return sum;
    }

    static int h1(int key) { return key % M; }
    static int h2(int key) { return 1 + (key % (M - 1)); }

    static boolean find(String str) {
        int key = getKey(str.toCharArray());  // 文字列を数値に変換
        for (int i = 0; ; i++) {
            int h = (h1(key) + i * h2(key)) % M;
            if (hashTable[h] == null || hashTable[h].length() <= 0) {
                return false;
            } else if (hashTable[h].equals(str)) {
                return true;
            }
        }
    }

    static void insert(String str) {
        int key = getKey(str.toCharArray());  // 文字列を数値に変換
        for (int i = 0; ; i++) {
            int h = (h1(key) + i * h2(key)) % M;
            if (hashTable[h] == null || hashTable[h].length() <= 0) {
                hashTable[h] = str;
                return;
            } else if (hashTable[h].equals(str)) {
                return;
            }
        }
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
