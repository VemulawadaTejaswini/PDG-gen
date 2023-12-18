import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int kai = b /a;
        if (kai < c) {
            System.out.println(kai);
        } else {
            System.out.println(c);
        }
    }
}