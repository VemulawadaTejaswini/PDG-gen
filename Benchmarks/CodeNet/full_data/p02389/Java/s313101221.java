
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        System.out.println(String.format("%d %d", a * b, 2 * (a + b)));
    }
}