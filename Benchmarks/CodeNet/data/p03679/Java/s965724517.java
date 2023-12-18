import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int out = b - a;
        if (out > x) {
            System.out.println("dangerous");
        } else if (a >= b) {
            System.out.println("delicious");
        } else {
            System.out.println("safe");
        }
    }
}
