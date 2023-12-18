import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0 ; i < m ; i++) {
            int a = i + 1;
            int b = 2 * m - i + 1;
            System.out.println(a + " " + b);
        }
    }

}