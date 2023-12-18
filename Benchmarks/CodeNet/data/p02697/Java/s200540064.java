import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0 ; i < m ; i++) {
            if (i % 2 == 0) {
                int a = i / 2 + 1;
                int b = m - i / 2 + 1;
                System.out.println(a + " " + b);
            } else {
                int a = n - i / 2;
                int b = n - m + i / 2 +1;
                System.out.println(a + " " + b);
            }

        }
    }

}