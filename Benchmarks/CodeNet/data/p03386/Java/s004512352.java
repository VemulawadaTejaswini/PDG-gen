import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for (int i = a; i <= Math.min(b, a + k - 1); i++) {
            System.out.println(i);
        }
        for (int i = Math.max(b - k + 1, a + k); i <= b; i++) {
            System.out.println(i);
        }
    }
}