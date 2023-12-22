import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        boolean ok = false;
        for (int i = 0; i <= X; i++) {
            int sum = 2 * i + 4 * (X - i);
            if (sum == Y) {
                ok = true;
                break;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}