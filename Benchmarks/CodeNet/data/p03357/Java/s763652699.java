import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] a;
    static boolean[] c;
    static int[] nth;

    static void swap(int i) {
        int     tmpa = a[i]; a[i] = a[i+1]; a[i+1] = tmpa;
        boolean tmpc = c[i]; c[i] = c[i+1]; c[i+1] = tmpc;
    }

    static boolean scan() {
        boolean finish = true;
        int w = 0, b = 0;
        for (int i=0; i<n*2; i++) {
            if (c[i]) { nth[i] = ++w; }
            else      { nth[i] = ++b; }
            if (a[i] != nth[i]) finish = false;
        }
        return finish;
    }


    static void print() {
        /*
        for (int i=0; i<n*2; i++) {
            System.out.printf("%2d ", a[i]);
        }
        System.out.println();
        for (int i=0; i<n*2; i++) {
            System.out.printf(" %c ", c[i]?'W':'B');
        }
        System.out.println();
        for (int i=0; i<n*2; i++) {
            System.out.printf("%2d ", nth[i]);
        }
        System.out.println();
        System.out.println();
        */
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(input.readLine());
        a = new int[n*2];
        c = new boolean[n*2];
        nth = new int[n*2];

        for (int i=0; i<n*2; i++) {
            StringTokenizer t = new StringTokenizer(input.readLine());
            c[i] = t.nextToken().equals("W");
            a[i] = Integer.parseInt(t.nextToken());
        }
        print();

        int step;
        for (step=0; !scan(); step++) {
            boolean changed = false;
            for (int i=0; i<n*2-1; i++) {
                if (a[i] > nth[i] && a[i+1] < nth[i+1]) {
                    //System.out.println("step ="+step+" both " + i);
                    changed = true; swap(i); print(); break;
                }
            }
            if (changed) continue;
            for (int i=0; i<n*2-1; i++) {
                if (a[i] > nth[i] && a[i+1] == nth[i+1]) {
                    //System.out.println("step ="+step+" down " + i);
                    changed = true; swap(i); print(); break;
                }
                if (a[i] == nth[i] && a[i+1] < nth[i+1]) {
                    //System.out.println("step ="+step+" up " + i);
                    changed = true; swap(i); print(); break;
                }
            }
        }
        System.out.println(step);
    }
}
