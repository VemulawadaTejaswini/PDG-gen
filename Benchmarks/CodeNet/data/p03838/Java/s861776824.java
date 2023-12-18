import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX < absY) {
            if (x >= 0) {
                System.out.println(y - x);
            } else if (x < 0 && y >= 0) {
                System.out.println(y + x + 1);
            } else {
                System.out.println(absX + absY + 2);
            }
        } else if (absX == absY) {
            System.out.println(1);
        } else {
            if (y >= 0) {
                System.out.println(x - y);
            } else if (y < 0 && x >= 0) {
                System.out.println(y + x + 1);
            } else {
                System.out.println(absX - absY);
            }
        }

    }

}