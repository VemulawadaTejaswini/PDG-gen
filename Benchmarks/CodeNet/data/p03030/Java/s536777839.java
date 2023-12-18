import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Tuple[] ts = new Tuple[n];

        for (int i = 0; i < n; i++) {
            String s = in.next();
            int p = in.nextInt();
            ts[i] = new Tuple(s, p, i);
        }

        Arrays.sort(ts);

        for (int i = 0; i < n; i++) {
            System.out.println(ts[i].i + 1);
        }
    }
}

/**
 s tuple
*/
class Tuple implements Comparable<Tuple> {
    String s;
    int p;
    int i;

    public Tuple(String s, int p, int i) {
        this.s = s;
        this.p = p;
        this.i = i;
    }

    @Override
    public int compareTo(Tuple o) {
        if (!this.s.equals(o.s)) {
            return this.s.compareTo(o.s);
        } else {
            if (this.p < o.p) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
