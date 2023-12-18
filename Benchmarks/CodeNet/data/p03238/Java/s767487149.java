import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
        } else {
            int b = sc.nextInt();
            int a = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }

}
