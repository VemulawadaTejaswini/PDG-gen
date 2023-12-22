
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        int c1 = 0;
        int t2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int c2 = 0;
        int t3 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int c3 = 0;
        int t4 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int c4 = 0;
        if (t1 == 1) {
            c1 = 6000 * n1;
        } else if (t1 == 2) {
            c1 = 4000 * n1;
        } else if (t1 == 3) {
            c1 = 3000 * n1;
        } else {
            c1 = 2000 * n1;
        }
        if (t2 == 1) {
            c2 = 6000 * n2;
        } else if (t2 == 2) {
            c2 = 4000 * n2;
        } else if (t2 == 3) {
            c2 = 3000 * n2;
        } else {
            c2 = 2000 * n2;
        }
        if (t3 == 1) {
            c3 = 6000 * n3;
        } else if (t3 == 2) {
            c3 = 4000 * n3;
        } else if (t3 == 3) {
            c3 = 3000 * n3;
        } else {
            c3 = 2000 * n3;
        }
        if (t4 == 1) {
            c4 = 6000 * n4;
        } else if (t4 == 2) {
            c4 = 4000 * n4;
        } else if (t4 == 3) {
            c4 = 3000 * n4;
        } else {
            c4 = 2000 * n4;
        }
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
