import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            while (n-- > 0) {
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                int s = a + b + c;
                System.out.println(a >= 100 || b >= 100 || c >= 100 || s >= 240 || a + b >= 180 ? "A" : s >= 210 || s >= 150 && (a >= 80 || b >= 80) ? "B" : "C");
            }
        }
    }
}
