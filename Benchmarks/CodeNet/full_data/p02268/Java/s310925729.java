import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.nextInt();
        }

        int number = 0;

        for (int i = 0; i < q; i++) {
            int min = 0;
            int sup = n;
            LOOP: while(true) {
                if (t[i] >= s[(min + sup) / 2]) {
                    min = (min + sup) / 2;
                } else {
                    sup = (min + sup) / 2;
                }
                if (sup - min <= 1) {
                    if (t[i] == s[min]) number++;
                    break LOOP;
                }
            }

        }

        System.out.println(number);
        scanner.close();
    }
}

