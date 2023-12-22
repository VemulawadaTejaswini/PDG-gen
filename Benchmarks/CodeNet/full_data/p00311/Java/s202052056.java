import java.util.Scanner;

class Main {

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

        int h = h1 * a + (h1 / 10 * c) + h2 * b + (h2 / 20 * d);
        int k = k1 * a + (k1 / 10 * c) + k2 * b + (k2 / 20 * d);
        
        if (h > k) {
            System.out.println("hiroshi");
        }
        if (h < k) {
            System.out.println("kenjiro");
        }
        if (h == k) {
            System.out.println("even");
        }

    }
}

