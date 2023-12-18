import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        for (int i = a; i <= a * b; i += a) {
            if (i % b == c) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}