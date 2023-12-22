import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s]+");

        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int[] number = new int[w + 1];
        for (int i = 1; i <= w; i++) {
            number[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = number[a];
            number[a] = number[b];
            number[b] = temp;
        }
        for (int i = 1; i <= w; i++) {
            System.out.println(number[i]);
        }
    }

    public static void main(String... args) {
        solve();
    }
}