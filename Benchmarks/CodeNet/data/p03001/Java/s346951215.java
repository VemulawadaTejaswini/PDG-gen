import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.print(Double.valueOf(w) * Double.valueOf(h) / 2.0);
//        if (w / 2 == x && w % 2 == 0 && h / 2 == y && h % 2 == 0) {
        if (w == x * 2 && h == y * 2) {
            System.out.println(" 1");
        } else {
            System.out.println(" 0");
        }
    }

}
