import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  m = sc.nextInt();
        int a = (int) Math.pow(2, m);
        int b = 1900 * m * a;
        int c = (n - m) * a * 100;
        System.out.println(b + c);
    }
}
