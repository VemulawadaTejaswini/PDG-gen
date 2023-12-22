

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int s[] = new int[n];
        int f[] = new int[n];
        int g = 0;
        int i;
        for (i = 0; i < n; i++) {
            s[i] = scan.nextInt();
            f[i] = scan.nextInt();

            if (s[i] < a && b < f[i] || s[i] < b && a < f[i]) {
                g += 0;
            } else {
                g += 1;
            }

        }
        if (g == n) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

}

