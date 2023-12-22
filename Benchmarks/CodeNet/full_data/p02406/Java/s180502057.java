import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        call(n);
        System.out.println();
        sc.close();
    }
    public static void call(int n) {
        for (int i = 1; i <= n; i++) {
            if(((i % 3) == 0) || ((i % 10) == 3)) {
                System.out.print(" " + i);
            } else {
                int x = i / 10;
                while (x != 0) {
                    if ((x % 10) == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
    }
}
