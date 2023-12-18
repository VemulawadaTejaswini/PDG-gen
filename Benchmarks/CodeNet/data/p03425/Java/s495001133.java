import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = 0, a = 0, r = 0, c = 0, h = 0;
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            if (ch == 'M') {
                m++;
            } else if (ch == 'A') {
                a++;
            } else if (ch == 'R') {
                r++;
            } else if (ch == 'C') {
                c++;
            } else if (ch == 'H') {
                h++;
            }
        }
        long count = (long) (m * a * r) + (long) (m * a * c) + (long) (m * a * h)
                     + (long) (m * r * c) + (long) (m * r * h) + (long) (m * c * h)
                     + (long) (a * r * c) + (long) (a * r * h) + (long) (a * c * h)
                     + (long) (r * c * h);
        System.out.println(count);
    }
}
