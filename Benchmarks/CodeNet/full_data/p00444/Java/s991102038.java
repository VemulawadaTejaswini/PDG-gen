import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = { 500, 100, 50, 10, 5, 1 };
        while (true) {
            int n = 1000 - sc.nextInt();
            if (n == 1000) {
                break;
            }
            int count = 0;
            while (n > 0) {
                for (int i = 0; i < c.length; i++) {
                    if (n >= c[i]) {
                        n -= c[i];
                        count++;
                        i--;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
