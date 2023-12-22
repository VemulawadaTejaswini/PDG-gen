
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[7];
        int b[] = new int[7];
        int c[] = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = a[i] - b[i];
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(c[i]);
        }
    }
}

