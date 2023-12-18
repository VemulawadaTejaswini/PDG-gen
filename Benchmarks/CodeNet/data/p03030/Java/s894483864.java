import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Sp[] sp = new Sp[n];
        for (int i = 0; i < n; i++) {
            sp[i] = new Sp(sc.next(), sc.nextInt(), i+1);
        }
        Arrays.sort(sp, (sp1, sp2) -> {
            if (sp1.s.equals(sp2.s)) {
                return Integer.compare(sp2.p, sp1.p);
            } else {
                return sp1.s.compareTo(sp2.s);
            }
        });
        for (Sp s : sp) {
            System.out.println(s.i);
        }
    }

    static class Sp {
        String s;
        int p;
        int i;

        public Sp(String s, int p, int i) {
            this.s = s;
            this.p = p;
            this.i = i;
        }
    }

}
