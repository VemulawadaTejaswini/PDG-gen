import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int area = w * h / 2;
        if (2 * x == w && 2 * y == h) System.out.println(area + " " + 1);
        else System.out.println(area + " " + 0);
    }
}
