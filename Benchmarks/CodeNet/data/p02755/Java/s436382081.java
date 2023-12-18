import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (20 < (b - a) || (b - a) < 0) {
            System.out.println(-1);
        } else {
            for (int i = 1; i <= 1000; i++) {
                int at = (int) (i * 0.08);
                int bt = (int) (i * 0.1);
                if (at == a && bt == b) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}