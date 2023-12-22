import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s[] = new String[n];
        Pair p[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();

            Pair t = new Pair();
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == '(') {
                    t.open++;
                } else {
                    if (t.open > 0) {
                        t.open--;
                    } else {
                        t.close++;
                    }
                }
            }
            p[i] = t;
        }

        Arrays.sort(p);

        long totalOpen = 0;
        for (int i = 0; i < n; i++) {
            totalOpen -= p[i].close;
            if (totalOpen < 0) {
                System.out.println("No");
                return;
            }
            totalOpen += p[i].open;
        }

        if (totalOpen == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Pair implements Comparable<Pair> {
    int open = 0;
    int close = 0;

    @Override
    public int compareTo(Pair o) {
        if (this.close < o.close) {
            return -1;
        } else if (this.close > o.close) {
            return 1;
        } else {
            if (this.open > o.open) {
                return -1;
            } else if (this.open < o.open) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}