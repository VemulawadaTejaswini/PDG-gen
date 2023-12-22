import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int h1 = sc.nextInt();
            int h2 = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int hiroshi = h1 * a + (h1 / 10) * c + h2 * b + (h2 / 20) * d;
            int kenjiro = k1 * a + (k1 / 10) * c + k2 * b + (k2 / 20) * d;

            if ( hiroshi > kenjiro ) {
                System.out.println("hiroshi");
            } else if ( hiroshi < kenjiro ) {
                System.out.println("kenjiro");
            } else {
                System.out.println("even");
            }
        }
    }
}

