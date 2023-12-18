import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int ans1 = (int)Math.ceil(c * 1.0 / b);
        int ans2 = (int)Math.ceil(a * 1.0 / d);
        if (ans1 > ans2) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}