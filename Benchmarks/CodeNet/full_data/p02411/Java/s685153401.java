import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int p = m + f;
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1) {
                System.out.printf("F\n");
            } else if (80 <= p) {
                System.out.printf("A\n");
            } else if (65 <= p) {
                System.out.printf("B\n");
            } else if (50 <= p || r >= 50) {
                System.out.printf("C\n");
            } else if (30 <= p) {
                System.out.printf("D\n");
            } else if (0 <= p) {
                System.out.printf("F\n");
            }
        }
    }
}
