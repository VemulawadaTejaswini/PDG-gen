import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s]+");
        int total1 = 0;
        int total2 = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            int price = scanner.nextInt();
            int amount = scanner.nextInt();
            total1 += price * amount;
            total2 += amount;
            counter++;
        }
        System.out.println(total1);
        System.out.println((int) ((double) total2 / counter + 0.5));
    }

    public static void main(String... args) {
        solve();
    }
}