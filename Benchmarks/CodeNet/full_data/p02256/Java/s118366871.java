import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        do {
            int c = a % b;
            a = b;
            b = c;
        } while (b != 0);
        sc.close();
        System.out.println(a);
    }
}
