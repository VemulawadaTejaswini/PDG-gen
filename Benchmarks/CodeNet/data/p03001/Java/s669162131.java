import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double ans = w * h / 2.0;
        boolean isMulti = x*2==w && y*2==h;

        System.out.print(ans + " ");
        System.out.println(isMulti ? "1" : "0");
    }
}