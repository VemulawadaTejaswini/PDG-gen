
import java.util.Scanner;

class Main {

    static int score(int iwana, int yamame, int a, int b, int c, int d) {
        return a * iwana + b * yamame + iwana / 10 * c + yamame / 20 * d;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h1 = scan.nextInt();
        int h2 = scan.nextInt();
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int hiroshiScore = score(h1, h2, a, b, c, d);

        int kenjiroScore = score(k1, k2, a, b, c, d);

        if (hiroshiScore > kenjiroScore) {
            System.out.println("hiroshi");
        } else {
            if (hiroshiScore < kenjiroScore) {
                System.out.println("kenjiro");
            } else {
                System.out.println("even");
            }
        }
    }
}

