import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if (x < 0 || y < 0) System.out.println("No");
        else if (x + r <= w && y + r <= h) System.out.println("Yes");
        else System.out.println("No");
    }
}


