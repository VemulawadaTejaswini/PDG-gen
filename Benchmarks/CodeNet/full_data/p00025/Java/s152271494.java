import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int[] a = new int[4];
            int[] b = new int[4];
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            a[2] = scanner.nextInt();
            a[3] = scanner.nextInt();
            b[0] = scanner.nextInt();
            b[1] = scanner.nextInt();
            b[2] = scanner.nextInt();
            b[3] = scanner.nextInt();
            int hit = 0;
            int blow = 0;
            boolean[] table = new boolean[10];
            for (int i = 0; i < 4; i++) {
                if (a[i] == b[i]) {
                    hit++;
                } else {
                    table[a[i]] = true;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (table[b[i]]) {
                    blow++;
                }
            }
            System.out.println(hit + " " + blow);
        }
    }

    public static void main(String... args) {
        solve();
    }
}