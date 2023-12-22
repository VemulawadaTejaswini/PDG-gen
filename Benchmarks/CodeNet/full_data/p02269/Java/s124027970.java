import java.util.Scanner;

public class Main {
    private static int M = 1046527;
    private static String[] H = new String[M];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = scanner.next();
            String s = scanner.next();
            if("insert".equals(cmd)) {
                insert(s);
            } else {
                System.out.println(find(s) ? "yes" : "no");
            }
        }
    }

    private static int getChar(char c) {
        if (c == 'A') {
            return 1;
        } else if (c == 'C') {
            return 2;
        } else if (c == 'G') {
            return 3;
        } else if (c == 'T') {
            return 4;
        } else {
            return 0;
        }
    }

    private static int getKey(char[] c) {
        int sum = 0;
        int p = 1;
        for (int i = 0; i < c.length; i++) {
            sum += p *getChar(c[i]);
            p *= 5;
        }
        return sum;
    }

    private static int h1(int key) {
        return key % M;
    }

    private static int h2(int key) {
        return 1 + (key % (M - 1));
    }

    private static boolean find(String s) {
        int key = getKey(s.toCharArray());
        int i = 0;
        while (true) {
            int h = (h1(key) + i * h2(key)) % M;
            if (s.equals(H[h])) {
                return true;
            } else if (H[h] == null) {
                return false;
            }
            i++;
        }
    }

    private static boolean insert(String s) {
        int key = getKey(s.toCharArray());
        int i = 0;
        while (true) {
            int h = (h1(key) + i * h2(key)) % M;
            if (s.equals(H[h])) {
                return true;
            } else if (H[h] == null) {
                H[h] = s;
                return false;
            }
            i++;
        }
    }
}