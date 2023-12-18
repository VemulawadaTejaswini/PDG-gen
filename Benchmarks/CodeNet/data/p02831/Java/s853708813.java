import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long c = a * b;
        int d = a % b;
        while(d != 0) {
            a = b;
            b = d;
            d = a % b;
        }
        System.out.println(c/b);
    }
}