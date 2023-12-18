import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            HashMap<Integer, Integer> ev = new HashMap<>();
            HashMap<Integer, Integer> od = new HashMap<>();

            int ev1 = -1;
            int ev2 = -1;
            int od1 = -1;
            int od2 = -1;

            for (int i = 0; i < n / 2; i++) {
                ev.merge(in.nextInt(), 1, Integer::sum);
                od.merge(in.nextInt(), 1, Integer::sum);
            }

            ArrayList<Integer> ale = new ArrayList<>(ev.keySet());
            ArrayList<Integer> alo = new ArrayList<>(od.keySet());

            for (Integer k : ale) {
                if (ev1 == -1) {
                    ev1 = k;
                } else {
                    if (ev.get(ev1) <= ev.get(k)) {
                        ev2 = ev1;
                        ev1 = k;
                    } else {
                        if (ev2 == -1) {
                            ev2 = k;
                        } else if (ev.get(ev2) <= ev.get(k)) {
                            ev2 = k;
                        }
                    }
                }
            }

            for (Integer k : alo) {
                if (od1 == -1) {
                    od1 = k;
                } else {
                    if (od.get(od1) <= od.get(k)) {
                        od2 = od1;
                        od1 = k;
                    } else {
                        if (od2 == -1) {
                            od2 = k;
                        } else if (od.get(od2) <= od.get(k)) {
                            od2 = k;
                        }
                    }
                }
            }
            if (ev1 != od1) {
                out.println((n / 2 - ev.get(ev1)) + (n / 2 - od.get(od1)));
            } else {

                if (ev2 == -1 && od2 == -1) {
                    out.println(n / 2);
                } else {
                    out.println(Math.min((n / 2 - ev.get(ev1)) + (n / 2 - od.get(od2)),
                            (n / 2 - ev.get(ev2)) + (n / 2 - od.get(od1))));
                }
            }


        }

    }
}

