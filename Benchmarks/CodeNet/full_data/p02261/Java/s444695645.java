import java.util.*;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        String[] a = new String[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.next();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j].charAt(1) < a[j - 1].charAt(1)) {
                    String temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%s", a[l]);
            } else {
                System.out.printf(" %s", a[l]);
            }
        }

        System.out.println("\nStable");

        String[] c = a;

        for (int i = 0; i < c.length; i++) {
            int mini = i;
            for (int j = i+1; j < c.length; j++) {
                if (c[mini].charAt(1) > c[j].charAt(1)) {
                    mini = j;
                }
            }

            if (i != mini) {
                String temp = a[i];
                a[i] = a[mini];
                a[mini] = temp;
            }
        }


        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%s", c[l]);
            } else {
                System.out.printf(" %s", c[l]);
            }
        }

        if (a == c) {
            System.out.println("\nStable");
        } else {
            System.out.println("\nNot Stable");
        }
    }
}

