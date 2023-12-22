import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[101];
        while (scanner.hasNext()) {
            counts[scanner.nextInt()]++;
        }
        int maximum = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maximum) {
                maximum = counts[i];
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maximum) {
                System.out.println(i);
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}