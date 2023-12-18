import java.util.Scanner;

public class Main {
    static final int MAX_A = 1000000000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] a = new char[MAX_A + 1];
        for (int i = 0; i < n; i++) {
            int index = scan.nextInt();
            a[index] += 1;
        }
        int index = 0;
        for (int i = MAX_A; i > 0; i--) {
            if (a[i] >= 2) {
                if (index != 0) {
                    System.out.println((int)index * i);
                    return;
                } else {
                    index = (int)i;
                }
            }
        }
        System.out.println(0);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
