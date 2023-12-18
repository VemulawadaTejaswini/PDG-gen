import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int acc = 0;
        for (int i = 0; i < n; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            acc += b;
            if (k <= acc) {
                System.out.println(a);
                break;
            }
        }
    }

}