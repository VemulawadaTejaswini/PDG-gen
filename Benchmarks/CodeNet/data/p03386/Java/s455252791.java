
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a; i <= Math.min(a + c, b); i++) {
            System.out.println(i);
        }
        for (int i = Math.max(b - c, a + c + 1); i <= b; i++) {
            System.out.println(i);
        }
    }
}
