import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a; i <= a * b; i+=a) {
            if (i % b == c) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}