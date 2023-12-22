import java.util.*;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        String[] b = new String[total];
        String[] c = new String[total];

        for (int k = 0; k < total; k++) {
            String a = inp.next();

            b[k] = a;
            c[k] = a;
        }

        for (int i = 0; i < total; i++) {
            for (int j = total - 1; j > i; j--) {
                if (b[j].charAt(1) < b[j - 1].charAt(1)) {
                    String temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                }
            }
        }

        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%s", b[l]);
            } else {
                System.out.printf(" %s", b[l]);
            }
        }

        System.out.println("\n" + "Stable");


        for (int i = 0; i < total; i++) {
            int mini = i;
            for (int j = i + 1; j < total; j++) {
                if (c[j].charAt(1) < c[mini].charAt(1)) {
                    mini = j;
                }
            }

            if (i != mini) {
                String temp = c[i];
                c[i] = c[mini];
                c[mini] = temp;
            }
        }


        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%s", c[l]);
            } else {
                System.out.printf(" %s", c[l]);
            }
        }

        int counter = 0;

        for (int l = 0; l < total; l++) {
            if (b[l] == c[l]) {
                {
                    counter++;
                }
            }
        }

        if (counter == total) {
            System.out.print("\n" + "Stable");
        } else {
            System.out.print("\n" + "Not stable");
        }
    }
}

