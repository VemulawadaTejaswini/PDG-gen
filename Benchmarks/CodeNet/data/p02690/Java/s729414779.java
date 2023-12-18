import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1 ; i * i <= x ; i++) {
            if (x % i == 0) {
                int n = i;
                int m = x / i;
                for (int j = -50000 ; j < 50000; j++ ) {
                    int a = j;
                    int b = a - n;
                    if ((long) (a * a * a *a + a * a * a * b + a* a* b * b + a * b * b * b + b * b * b * b) == m) {
                        System.out.println(a + " " + b);
                        return;
                    }
                }
            }
        }
    }

}