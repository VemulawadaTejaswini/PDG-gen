package ws.harro.apps;

import java.util.Scanner;

public class untitled1 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[200000], q = new int[200000];
        for (int i = 0; i < n; i++) {
            q[input.nextInt() - 1] = i;
        }
        int r = 0, f = 1000000, c = 0;
        for (int i = 0; i < n; i++) {
            if (f < q[i]) {
                c++;
            } else {
                c = 1;
            }
            f = q[i];
            if (r < c) r = c;
        }
        System.out.println(n - r);
    }
}
