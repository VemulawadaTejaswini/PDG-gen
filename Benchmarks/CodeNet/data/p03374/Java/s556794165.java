import java.util.*;

public class Main {
    static List<Sushi> a;
    static List<Sushi> b;
    static long c;
    static long[] sr;
    static long[] sl;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        c = scan.nextLong();
        a = new ArrayList<>();
        b = new ArrayList<>();
        sr = new long[n];
        sl = new long[n ];
        for (int i = 0; i < n; i++) {
            Sushi sushi = new Sushi(scan.nextLong(), scan.nextInt());
            a.add(sushi);
            b.add(sushi);
        }
        a.sort(Comparator.comparingLong(Sushi::getX));
        b.sort(Comparator.comparingLong(Sushi::getX).reversed());
        long max = 0;
        long cv = 0;
        int index = 0;
        for (Sushi s : a) {
            cv += s.v;
            sr[index] = cv;
            max = Math.max(max, cv - s.x);
            index++;
        }
        cv = 0;
        index = 0;
        for (Sushi s : b) {
            cv += s.v;
            sl[index] = cv;
            max = Math.max(max, cv - (c - s.x));
            index++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long l = a.get(i).x;
                long r = c - a.get(j).x;
                max = Math.max(max, sl[i] + sr[n - j - 1] - l - r -Math.min(l, r));
            }
        }
        System.out.println(max);
    }

    static class Sushi {
        long x;
        int v;

        public Sushi(long x, int v) {
            this.x = x;
            this.v = v;
        }

        public long getX() {
            return x;
        }

        public int getV() {
            return v;
        }
    }
}