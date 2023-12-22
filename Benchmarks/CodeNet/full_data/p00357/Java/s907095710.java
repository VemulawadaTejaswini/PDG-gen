
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t[] = new int[n];
        int m = 0;
        int s = 0;

        for (int i = 0; i < n; i++) {
            t[i] = scan.nextInt();
        }

        for (int l = 0; l < n; l++) {
            if (m < l * 10) {
                s = 1;
            }
            if (m < l * 10 + t[l]) {
                m = l * 10 + t[l];
            }
        }
        if (s == 1) {
            System.out.println("no");
        } else {
            m = 0;
            for (int i = 0; i < n; i++) {
                if (m < i * 10) {
                    s = 1;
                }
                if (m < i * 10 + t[n - 1 - i]) {
                    m = i * 10 + t[n - 1 - i];
                }
            }
            if (s == 1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}

