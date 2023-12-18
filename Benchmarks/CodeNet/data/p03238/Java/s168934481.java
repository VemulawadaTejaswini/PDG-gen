
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Hello World");
            return;
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(b + c);
    }
}
